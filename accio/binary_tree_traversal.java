import java.util.Scanner;

public class binary_tree_traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void insert(Node root,int data){
        if(data>root.data){
            if(root.right!=null){
                insert(root.right,data);
            }else{
                root.right = new Node(data);
            }
        }else{
            if(root.left!=null){
                insert(root.left,data);
            }else{
                root.left = new Node(data);
            }
        }
    }

    static void preorder(Node root){
        System.out.print(root.data+" ");
        if(root.left!=null){
            preorder(root.left);
        }
        if(root.right!=null){
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = new Node(sc.nextInt());
        for(int i=0;i<n-1;i++){
            insert(root,sc.nextInt());
        }
        preorder(root);
    }
}
