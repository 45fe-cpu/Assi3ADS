class BSTTest {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "A");
        tree.put(3, "B");
        tree.put(7, "C");
        tree.put(2, "D");
        tree.put(4, "E");

        System.out.println("Tree size: " + tree.size());
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}