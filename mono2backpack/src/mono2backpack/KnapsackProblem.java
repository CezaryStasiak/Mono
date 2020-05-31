/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mono2backpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author dasepa
 */
public class KnapsackProblem {

    LinkedList<KnapsackItem> items = new LinkedList<>();
    int knapsackSize;

    public KnapsackProblem(HashMap items, int knapsackSize) {
        Iterator it = items.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            KnapsackItem item = (KnapsackItem) pair.getValue();
            this.items.add(item);
        }
        this.knapsackSize = knapsackSize;
    }

    public int calcSpaceTaken(int[] chosenItems) {
        int value = 0;
        for (int i = 0; i < this.items.size(); i++) {
            if (chosenItems[i] == 1) {
                value += this.items.get(i).space;
            }
        }
        return value;
    }

    public int calcKnapsackValue(int[] chosenItems) {
        int value = 0;
        for (int i = 0; i < this.items.size(); i++) {
            if (chosenItems[i] == 1) {
                KnapsackItem item = this.items.get(i);
                if (bonusValueActive(item, chosenItems)) {
                    value += item.newVal;
                } else {
                    value += item.baseVal;
                }
            }
        }
        return value;
    }

    public boolean bonusValueActive(KnapsackItem item, int[] chosenItems) {
        if (item.newValReqItems == null) {
            return false;
        }
        LinkedList<String> itemNames = new LinkedList<>();

        for (int i = 0; i < this.items.size(); i++) {
            if (chosenItems[i] == 1) {
                itemNames.add(this.items.get(i).name);
            }
        }

        for (LinkedList<String> bonusReqItemSet : item.newValReqItems) {
            boolean check = true;
            for (String bonusItemName : bonusReqItemSet) {
                if (!itemNames.contains(bonusItemName)) {
                    check = false;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }

    public String chosenItemsToString(int[] chosenItems) {
        LinkedList<String> itemNames = new LinkedList<>();
        String s = "";
        for (int i = 0; i < this.items.size(); i++) {
            if (chosenItems[i] == 1) {
                s += this.items.get(i).name+" ";
            }
        }
        return s;
    }
}
