
package monoplecak;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class ProblemPlecakowy {

    LinkedList<Przedmiot> items = new LinkedList<>();
    int knapsackSize;

    public ProblemPlecakowy(HashMap items, int knapsackSize) {
        Iterator it = items.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            
            Przedmiot item = (Przedmiot) pair.getValue();
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
                Przedmiot item = this.items.get(i);
                if (bonusValueActive(item, chosenItems)) {
                    value += item.newVal;
                } else {
                    value += item.baseVal;
                }
            }
        }
        return value;
    }

    public boolean bonusValueActive(Przedmiot item, int[] chosenItems) {
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
