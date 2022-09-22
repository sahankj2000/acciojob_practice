import java.util.Scanner;

public class singly_linked_list_delete {

    static Node head = new Node();

    static class Node{
        int data;
        int index;
        static int length = 0;
        Node next;
        Node(){
            this.data = -1;
            this.next = null;
            this.index = -1;
        }
        Node(int data){
            this.data = data;
            this.index = length;
            this.next = null;
            length++;
        }
    }

    static void insert(int data){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    static int delete(int index){
        Node prev = head;
        while (prev.index != index-1){
            prev = prev.next;
        }
        Node node = prev.next;
        int val = node.data;
        node = node.next;
        prev.next = node;
        Node.length--;
        while (node!=null){
            node.index--;
            node = node.next;
        }
        return val;
    }

    static void print(){
        Node temp = head.next;
        if(temp!=null) {
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        delete(Node.length/2);
        print();
    }
}