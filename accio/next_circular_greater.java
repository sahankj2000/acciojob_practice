import java.util.Scanner;
import java.util.Stack;

class cllNode{
    long data;
    cllNode next;

    public cllNode(long data) {
        this.data = data;
    }
}

class cll{
    cllNode head;
    private int length;

    public int getLength() {
        return length;
    }

    void insert(long val){
        if(head == null){
            head = new cllNode(val);
            head.next = head;
        }else {
            cllNode temp = head;
            while (temp.next!=head){
                temp = temp.next;
            }
            temp.next = new cllNode(val);
            temp.next.next = head;
        }
        length++;
    }

    void print(cllNode from){
        if(from!=null) {
            cllNode temp = from;
            while (temp.next != from) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

public class next_circular_greater {

    static cllNode ctail;
    static Stack<Long> stack = new Stack<>();
    static Stack<Long> ans = new Stack<>();

    static void function(cllNode temp){
        if(temp!=ctail){
            function(temp.next);
        }
        while (!stack.isEmpty() && stack.peek()<=temp.data){
            stack.pop();
        }
        if(stack.isEmpty()){
            ans.push(Long.valueOf(-1));
        }else{
            ans.push(stack.peek());
        }
        stack.push(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cll list = new cll();
        for(int i=0;i<n;i++){
            list.insert(sc.nextLong());
        }
        long largest = list.head.data;
        cllNode largestRef = list.head;
        cllNode temp = list.head.next;
        while (temp!=list.head){
            if(temp.data>largest){
                largest = temp.data;
                largestRef = temp;
            }
            temp = temp.next;
        }
        ctail = largestRef;
        function(largestRef.next);
        temp = largestRef.next;
        while (!ans.isEmpty()){
            temp.data = ans.pop();
            temp = temp.next;
        }
        list.print(list.head);
    }
}
