
package monoplecak;

import java.util.HashMap;
import java.util.LinkedList;

public class Przedmiot {
    
    public String name;
    public int space;
    public int baseVal;
    public LinkedList<LinkedList<String>> newValReqItems;
    public int newVal;
    
    public Przedmiot(String name, int space){
        this.name = name;
        this.space = space;
    }
}
