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
        assertThat(rootNode.children.size(), equalTo(3));
    }

}
