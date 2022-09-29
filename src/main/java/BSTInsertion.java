class BSTInsertion {
    static class Node{
        public int key;
        public Node left, right;
        
        public Node(int x) {
            key = x;
        }
    }

    static Node insert(Node temp, int key){
      //TODO: Insert your logic here...
    }


    public static void main(String[] args) {
        Node root;

        int key = /* TODO: new value to insert here... */;
        System.out.print("New Node: "+insert(root, key).key);

 
    }
}