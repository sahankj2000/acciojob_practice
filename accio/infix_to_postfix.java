import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix {

    static int precision(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                System.out.print(c);
            }else if(c == '(') {
                stack.push(c);
            }else if(c == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    System.out.print(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty() && (precision(c)<=precision(stack.peek()))){
                    System.out.print(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek()!='('){
                System.out.print(stack.pop());
            }else{
                stack.pop();
            }
        }
    }
}
