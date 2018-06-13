package structures;

import org.junit.Test;
import structures.tree.FamilyTree;
import structures.tree.TreeNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.IsEqual.equalTo;

public class FamilyTreeTest {

    FamilyTree bluthFamilyTree = new FamilyTree();
    TreeNode<String> rootNode = bluthFamilyTree.createFamilyTree();

    @Test
    public void checkRootNodeName() {
        assertThat(rootNode.toString(), equalToIgnoringCase("Lucille"));
    }

    @Test
    public void checkRootNumberOfChildren() {
        assertThat(rootNode.children.size(), equalTo(4));
    }

    @Test
    public void checkChildNames() {

        /**
         * BEWARE! Order matters! Based on this test, it looks like the first child name should be "George Oscar" ...
         */

        assertThat(rootNode.children.get(0).toString(), equalToIgnoringCase("George Oscar"));
        assertThat(rootNode.children.get(1).toString(), equalToIgnoringCase("Michael"));
        assertThat(rootNode.children.get(2).toString(), equalToIgnoringCase("Lindsay"));
        assertThat(rootNode.children.get(3).toString(), equalToIgnoringCase("Buster"));
    }

    @Test
    public void checkGeorgeMichaelIsGrandson() {
        TreeNode<String> georgeMichael = rootNode.findTreeNode("George Michael");
        assertThat(georgeMichael.parent.data, equalToIgnoringCase("Michael"));
    }

    @Test
    public void checkMaebyIsGranddaughter() {
        TreeNode<String> georgeMichael = rootNode.findTreeNode("Maeby");
        assertThat(georgeMichael.parent.data, equalToIgnoringCase("Lindsay"));
    }

}
