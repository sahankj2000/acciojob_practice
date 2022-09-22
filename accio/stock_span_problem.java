import java.util.Stack;

class Solution_stock_span_problem{
    public static int[] calculateSpan(int price[], int n) {
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0;i<n;i++){
            while (!stack.empty()&&price[stack.peek()]<=price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}

public class stock_span_problem {
    public static void main(String[] args) {
        int[] prices = {10,4,5,90,120,80};
        for(int x:Solution_stock_span_problem.calculateSpan(prices,prices.length)){
            System.out.print(x+" ");
        }
    }
}
