import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        for(char x:str.toCharArray()){
            if(x=='}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }else {
                    flag = false;
                    break;
                }
            }else if(x==')'){
                if(stack.peek() == '('){
                    stack.pop();
                }else {
                    flag = false;
                    break;
                }
            }else if(x==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }else {
                    flag = false;
                    break;
                }
            }else{
                stack.push(x);
            }
        }
        if (stack.isEmpty() && flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}