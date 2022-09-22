class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
    }
}

class LinkedList{
    Node head;
    private int length;

    int getLength(){
        return length;
    }
    void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    void printList(){
        if(head != null) {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void delete(int val) {
        if (head != null){
            Node temp = head;
            Node prev = null;
            while (temp.data != val && temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if(temp.data == val) {
                if (temp == head) {
                    if (temp.next == null) {
                        head = null;
                    } else {
                        head = head.next;
                    }
                } else {
                    if (temp.next == null) {
                        prev.next = null;
                    } else {
                        prev.next = temp.next;
                    }
                }
                length--;
            }
        }
    }

    void deleteAtIndex(int index){
        if(head == null || index < 0){
            return;
        }
        if(head.next == null && index == 0){
            head = null;
            length--;
            return;
        }
        if(index == 0){
            head = head.next;
            length--;
            return;
        }
        int i = 1;
        Node prev = head;
        Node temp = head.next;
        while (i<index && temp.next!=null){
            i++;
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            prev.next = null;
            length--;
        }else{
            prev.next = temp.next;
            length--;
        }
    }

    int peekAtIndex(int index){
        if(head == null || index<0){
            return -1;
        }
        if(index == 0){
            return head.data;
        }
        int i = 1;
        Node temp = head.next;
        while (i<index && temp.next!=null){
            i++;
            temp = temp.next;
        }
        if(i == index && temp!=null){
            return temp.data;
        }
        return -1;
    }

    Node nodeAtIndex(int index){
        if(head == null || index<0){
            return null;
        }
        if(index == 0){
            return head;
        }
        int i = 1;
        Node temp = head.next;
        while (i<index && temp.next!=null){
            i++;
            temp = temp.next;
        }
        if(i == index && temp!=null){
            return temp;
        }
        return null;
    }

    int peekFirst(){
        if(head != null) {
            return head.data;
        }
        return -1;
    }

    int peekLast(){
        return peekAtIndex(length-1);
    }

    void insertAtIndex(int index,int data){
        if(index<0){
            return;
        }
        if(index == 0){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            length++;
            return;
        }
        int i = 1;
        Node temp = head.next;
        Node prev = head;
        while (i<index && temp.next!=null){
            i++;
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            prev.next = new Node(data);
            length++;
            return;
        }
        if(i == index){
            Node temp2 = new Node(temp.data);
            temp2.next = temp.next;
            temp.data = data;
            temp.next = temp2;
            length++;
        }
        if(index == length){
            temp.next = new Node(data);
            temp.next.next = null;
            length++;
        }
    }

    private Node recursionReverse(Node node){
        if(node.next == null){
            this.head = node;
            return node;
        }
        Node nextNode = recursionReverse(node.next);
        nextNode.next = node;
        return node;
    }

    void reverse(){ // uses internal stack.... other version in main class is better approach
        Node last = recursionReverse(this.head);
        last.next = null;
    }
}

class circularLL{
    Node head;
    private int length;

    public int getLength() {
        return length;
    }

    void insert(int val){
        if(head == null){
            head = new Node(val);
            head.next = head;
        }else{
            Node temp = head;
            while (temp.next!=head){
                temp = temp.next;
            }
            temp.next = new Node(val);
            temp.next.next = head;
        }
        length++;
    }

    void printList(){
        if(head!=null){
            Node temp = head;
            while (temp.next!=head){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

public class linkedLists {

    static void revPrintLL(Node node){
        if(node.next != null){
            revPrintLL(node.next);
            System.out.print(" "+node.data);
        }else {
            System.out.print(node.data);
        }
    }

    static Node reverseList(Node node){ // O(n) for time and O(1) for space
        Node temp = node.next;
        Node prev = node;
        Node next;
        while (temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        node.next = null;
        return prev;
    }

    static LinkedList mergeSorted(LinkedList l1,LinkedList l2){
        LinkedList ll = new LinkedList();
        int a = l1.peekFirst();
        int b = l2.peekFirst();
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        Node temp;
        if(a<=b){
            ll.head = temp1;
            temp1 = temp1.next;
        }else{
            ll.head = temp2;
            temp2 = temp2.next;
        }
        temp = ll.head;
        while (temp1!=null || temp2!=null){
            if(temp1 == null){
                while (temp2.next!=null){
                    temp.next = temp2;
                    temp = temp.next;
                    temp2 = temp2.next;
                }
                temp.next = temp2;
                break;
            }
            if(temp2 == null){
                while (temp1.next!=null){
                    temp.next = temp1;
                    temp = temp.next;
                    temp1 = temp1.next;
                }
                temp.next = temp1;
                break;
            }
            if(temp1.data<=temp2.data){
                temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        return ll;
    }

    static void swapKth(LinkedList ll,int k){
        int n = ll.getLength();
        int firstIndex = k-1;
        int secondIndex = n-k;
        if(k>(n/2)){
            int temp = firstIndex;
            firstIndex = secondIndex;
            secondIndex = temp;
        }
        if(firstIndex != secondIndex){
            Node first = ll.nodeAtIndex(firstIndex);
            Node second = ll.nodeAtIndex(secondIndex);
            Node fPrev = ll.nodeAtIndex(firstIndex-1);
            Node sPrev = ll.nodeAtIndex(secondIndex-1);
            Node fNext = ll.nodeAtIndex(firstIndex+1);
            Node sNext = ll.nodeAtIndex(secondIndex+1);
            if(fPrev != null){
                fPrev.next = second;
            }
            if(first == ll.head){
                ll.head = second;
            }
            second.next = fNext;
            sPrev.next = first;
            first.next = sNext;
        }
    }

    static void printLL(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static LinkedList getAlternates(Node temp){
        LinkedList ans = new LinkedList();
        while (temp!=null){
            ans.insert(temp.data);
            if(temp.next!=null){
                temp = temp.next.next;
            }else {
                temp = null;
            }
        }
        return ans;
    }

    static LinkedList addition(LinkedList lla,LinkedList llb){
        lla.head = reverseList(lla.head);
        llb.head = reverseList(llb.head);
        Node anode = lla.head;
        Node bnode = llb.head;
        LinkedList ans = new LinkedList();
        int carry = 0;
        while (anode!=null || bnode != null){
            if(anode == null){
                while (bnode!=null){
                    int sum = bnode.data+carry;
                    ans.insert(sum%10);
                    carry = sum/10;
                    bnode = bnode.next;
                }
                break;
            }
            if(bnode == null){
                while (anode!=null){
                    int sum = anode.data+carry;
                    ans.insert(sum%10);
                    carry = sum/10;
                    anode = anode.next;
                }
                break;
            }
            int sum = anode.data+bnode.data+carry;
            ans.insert(sum%10);
            carry = sum/10;
            anode = anode.next;
            bnode = bnode.next;
        }
        ans.head = reverseList(ans.head);
        return ans;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.printList();
        ll.reverse();
        ll.printList();
        ll.head = reverseList(ll.head);
        ll.printList();
    }
}
