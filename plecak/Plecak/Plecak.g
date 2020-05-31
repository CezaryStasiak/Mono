grammar Plecak;

@header {
package mono2backpack;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import mono2backpack.KnapsackItem;
}

@members {
HashMap items = new HashMap();
int backpackSize;
}

parseData
	: 'Przedmioty:' getItems 'Warto\u015Bci:' getValues 'Plecak:' n=getBackpackSize { backpackSize = $n.value; } '.'
	;

getBackpackSize returns [int value]
	: INT { $value = Integer.parseInt($INT.text); }
	;

getItems
	: (i=item v=valParen { items.put($i.value, new KnapsackItem($i.value, $v.value)); } (',' i=item v=valParen { items.put($i.value, new KnapsackItem($i.value, $v.value)); })*)+ '.'
	;
	
getValues
	: ('warto\u015B\u0107(' i=item ') = ' v=val { KnapsackItem kItem1 = (KnapsackItem)items.get($i.value); kItem1.baseVal=$v.value; }
	('je\u015Bli' j1=jakJest 'inaczej' o=val { KnapsackItem kItem2 = (KnapsackItem)items.get($i.value); kItem2.newValReqItems=($j1.list); kItem2.newVal=$v.value; kItem2.baseVal=$o.value; })* 
	(',' 'warto\u015B\u0107(' i=item ') = ' v=val  { KnapsackItem kItem3 = (KnapsackItem)items.get($i.value); kItem3.baseVal=$v.value; } 
	('je\u015Bli' j2=jakJest 'inaczej' o=val { KnapsackItem kItem4 = (KnapsackItem)items.get($i.value); kItem4.newValReqItems=($j2.list); kItem4.newVal=$v.value; kItem4.baseVal=$o.value; })*)* 
	 '.')+
	;

jakJest returns [LinkedList<LinkedList<String>> list]
	: { $list = new LinkedList<LinkedList<String>>();} ('jest(' z=zestaw {$list.add($z.list);}('lub' x=zestaw {$list.add($x.list);})* ')')+
	;

zestaw returns [LinkedList<String> list]
	:	{ $list = new LinkedList<String>(); } (i1=item {$list.add($i1.value);})+ ('i ' i2=item {$list.add($i2.value);})*
	;


item returns [String value]
	: TEXT { $value = $TEXT.text; }
	;

valParen returns [int value]
	: '(' INT { $value = Integer.parseInt($INT.text); } ')'
	;

val returns [int value]
	: INT { $value = Integer.parseInt($INT.text); }
	;

TEXT : ([\p{Alpha}\p{General_Category=Other_Letter}] )+ ;

INT : '0'..'9'+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    -> channel(HIDDEN) ;
