import java.util.Scanner;
import java.util.Stack;

public class reverse_string_using_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        System.out.println(ans);
    }
}
