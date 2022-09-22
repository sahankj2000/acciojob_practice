import java.util.Scanner;

class DLLNode{
    int data;
    DLLNode prev;
    DLLNode next;

    public DLLNode(int val){
        data = val;
    }
}

class DoublyLinkedList{
    DLLNode head;
    DLLNode tail;
    private int length;

    public int getLength() {
        return length;
    }

    void insertLast(int val){
        if(head == null){
            head = new DLLNode(val);
            tail = head;
        }else{
            tail.next = new DLLNode(val);
            DLLNode temp = tail;
            tail = tail.next;
            tail.prev = temp;
        }
        length++;
    }

    void insertFirst(int val){
        if(head == null){
            head = new DLLNode(val);
            tail = head;
        }else{
            DLLNode temp = new DLLNode(val);
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        length++;
    }

    void printList(){
        if(head!=null){
            DLLNode temp = head;
            while (temp != tail){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void reversePrintList(){
        if(head!=null){
            DLLNode temp = tail;
            while (temp!=head){
                System.out.print(temp.data+" ");
                temp = temp.prev;
            }
            System.out.println(temp.data);
        }
    }
}

public class doublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        DoublyLinkedList dll = new DoublyLinkedList();
        for(int i=0;i<n;i++){
            dll.insertLast(sc.nextInt());
        }
        dll.insertFirst(k);
        dll.printList();
    }
}
