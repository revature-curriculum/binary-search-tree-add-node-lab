class BSTInsertion {
    static class Node{
        public int key;
        public Node left, right;
        
        public Node(int x) {
            key = x;
        }
    }
    
    static void inorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    static Node insert(Node temp, int key){
        if(temp == null){
            temp = new Node(key);
            return temp;
        }
        if(temp.key > key) temp.left = insert(temp.left,key);
        else temp.right = insert(temp.right,key);
        return temp;
    }


    public static void main(String[] args) {
        Node root;
        root = new Node(5);
        root.right = new Node(7);
        root.left = new Node(2);
        root.right.right = new Node(8);
        root.right.left = new Node(6);
        root.left.right = new Node(3);
        root.left.left = new Node(1);
        root.left.left.right = new Node(4);

        int key = /*new value to insert*/;
        insert(root, key);
 
    }
}