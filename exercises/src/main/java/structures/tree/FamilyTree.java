package structures.tree;

public class FamilyTree {

    public static void main (String[] args) {

    }

    public TreeNode<String> createFamilyTree() {
        //1st generation (root)
        TreeNode<String> lucille = new TreeNode<String>("Lucille");

        //2nd generation
        TreeNode michael = lucille.addChild("Michael");
        TreeNode lindsay = lucille.addChild("Lindsay");
        TreeNode buster = lucille.addChild("Buster");

        //3rd generation
        TreeNode georgeMichael = michael.addChild("George Michael");
        TreeNode maeby = lindsay.addChild("Maeby");

        return lucille;
    }
}
