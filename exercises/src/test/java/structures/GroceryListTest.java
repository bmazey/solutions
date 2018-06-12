package structures;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.IsEqual.equalTo;

public class GroceryListTest {

     private GroceryList myGroceryList = new GroceryList();

    @Test
    public void checkFirstItem() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.get(0), equalToIgnoringCase("milk"));
    }

    @Test
    public void checkSecondItem() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.get(1), equalToIgnoringCase("eggs"));
    }

    @Test
    public void checkThirdItem() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.get(2), equalToIgnoringCase("seltzer"));
    }

    @Test
    public void checkFourthItem() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.get(3), equalToIgnoringCase("cheese"));
    }

    @Test
    public void checkFifthItem() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.get(2), equalToIgnoringCase(groceryList.get(4)));
    }

    @Test
    public void checkListSize() {
        List<String> groceryList = myGroceryList.createGroceryList();
        assertThat(groceryList.size(), equalTo(5));
    }
}
