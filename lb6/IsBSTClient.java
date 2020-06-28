package lb6;

public class IsBSTClient {
    public static void main(String[] args) {
	BST<Time_,Integer> bst = new BST<>();
        for (int i = 0; i < 1374; i++) {
            bst.put(new Time_(),i);
        }
        StdOut.println(bst.IsBinarySearchTree());
        bst.MakeNotSearchBT();
        StdOut.println(bst.IsBinarySearchTree());
    }
}
