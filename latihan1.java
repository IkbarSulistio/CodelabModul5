class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class latihan1{
    public Node root;

    public latihan1() {
        root = null;
    }

    public void addroot(int data){
        root = new Node(data);
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder((node.left));
            System.out.println(node.data + " ");
            inOrder((node.right));
        }
    }
    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

     public static void main(String[] args) {
         latihan1 tree = new latihan1();

         tree.addroot(20);
         tree.root.left = new Node(2);
         tree.root.right = new Node(25);
         tree.root.left.left = new Node(37);
         tree.root.left.right = new Node(12);
         tree.root.right.right = new Node(16);

         System.out.println("\nPre Order: ");
         tree.preOrder(tree.root);
         System.out.println("\nIn Order: ");
         tree.inOrder(tree.root);
         System.out.println("\nPost Order: ");
         tree.postOrder(tree.root);
     }
}
