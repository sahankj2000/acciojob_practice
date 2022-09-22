import java.util.Scanner;
import java.util.Stack;

public class Height_problem {
    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        stack.push((long) -1);
        for(int i=0;i<n;i++){
            while (stack.peek()>=arr[i]){
                stack.pop();
            }
            System.out.print(stack.peek()+" ");
            stack.push(arr[i]);
        }
    }
}
