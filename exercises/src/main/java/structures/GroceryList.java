package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main (String[] args) {

    }

    public List<String> createGroceryList() {
        List<String> groceryList = new ArrayList<String>();
        groceryList.add("milk");
        groceryList.add("eggs");
        groceryList.add("seltzer");
        groceryList.add("cheese");
        groceryList.add("seltzer");

        return groceryList;
    }
}
