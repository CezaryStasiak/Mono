/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mono2backpack;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author dasepa
 */
public class KnapsackItem {
    
    public String name;
    public int space;
    public int baseVal;
    public LinkedList<LinkedList<String>> newValReqItems;
    public int newVal;
    
    public KnapsackItem(String name, int space){
        this.name = name;
        this.space = space;
    }
}
