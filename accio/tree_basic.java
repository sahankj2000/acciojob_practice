import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class treeNode{
    int data;
    treeNode right;
    treeNode left;
    treeNode(int val){
        data = val;
        right = null;
        left = null;
    }
}

class tree{
    treeNode head;
    private int size;

    tree(){
        head = null;
    }

    void insert(int val){
        if(head == null){
            head = new treeNode(val);
        }else{
            treeNode node = head;
            while (true){
                if(node.data < val){
                    if(node.right != null){
                        node = node.right;
                    }else{
                        node.right = new treeNode(val);
                        break;
                    }
                }else if(node.data > val){
                    if(node.left != null){
                        node = node.left;
                    }else{
                        node.left = new treeNode(val);
                        break;
                    }
                }else{ // repeated
                    return;
                }
            }
        }
        size++;
    }

    static int getLeastElement(treeNode node){
        if(node.left == null){
            return node.data;
        }
        return getLeastElement(node.left);
    }

    treeNode delete(treeNode node,int key){
        if(node!=null) {
            if (key < node.data) {
                node.left = delete(node.left, key);
            } else if (key > node.data) {
                node.right = delete(node.right, key);
            } else {
                if (node.left == null) {
                    return node.right;
                }
                if (node.right == null) {
                    return node.left;
                }
                node.data = getLeastElement(node.right);
                node.right = delete(node.right, node.data);
            }
        }
        return node;
    }

    int findIndex(int[] arr,int val,int first,int last){
        for(int i=first;i<=last;i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

    // doesnt work yet
    treeNode construct(int[] pre,int pfirst,int plast,int[] ino,int ifirst,int ilast){
        if(plast-pfirst>=0 && ilast-ifirst>=0){
            treeNode node = new treeNode(pre[pfirst]);
            int index = findIndex(ino,pre[pfirst],ifirst,ilast);
            node.left = construct(pre,pfirst+1,pfirst+(index-ifirst),ino,ifirst,index-1);
            node.right = construct(pre,pfirst+(index-ifirst)+1,plast,ino,index+1,ilast);
            return node;
        }
        return null;
    }
}

public class tree_basic {
    static void inorderPrint(treeNode node){
        if(node!=null){
            inorderPrint(node.left);
            System.out.print(node.data+" ");
            inorderPrint(node.right);
        }
    }

    static void preorderPrint(treeNode node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorderPrint(node.left);
            preorderPrint(node.right);
        }
    }

    static void postorderPrint(treeNode node){
        if(node!=null){
            postorderPrint(node.left);
            postorderPrint(node.right);
            System.out.print(node.data+" ");
        }
    }

    static boolean searchTree(treeNode node,int key){
        if(node!=null){
            if(node.data > key){
                return searchTree(node.left,key);
            }
            if(node.data < key){
                return searchTree(node.right,key);
            }
            return true;
        }
        return false;
    }

    static void leftView(treeNode node){
        if(node!=null){
            System.out.print(node.data+" ");
            if(node.left!=null){
                leftView(node.left);
            }else{
                leftView(node.right);
            }
        }
    }

    static void levelorderPrint(treeNode node){
        if(node!=null) {
            Queue<treeNode> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                treeNode temp = queue.poll();
                System.out.print(temp.data+" ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    static treeNode mirror(treeNode node){
        if(node == null){
            return node;
        }
        treeNode left = mirror(node.left);
        treeNode right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pre = new int[n];
        int[] ino = new int[n];
        for(int i=0;i<n;i++){
            pre[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            ino[i] = sc.nextInt();
        }
        tree tr = new tree();
        tr.head = tr.construct(pre,0,pre.length-1,ino,0,ino.length-1);
        /*preorderPrint(tr.head);
        System.out.println();
        inorderPrint(tr.head);
        System.out.println();*/
        postorderPrint(tr.head);
    }
}
