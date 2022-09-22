import java.math.BigInteger;

class Solution_climbing_stairs{
    public int climbStairs(int n) {
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            int x = 3;
            BigInteger temp = BigInteger.ZERO;
            while (x<=n){
                temp = two;
                two = one.add(two);
                one = temp;
                x++;
            }
        }
        return two.mod(BigInteger.valueOf((int)Math.pow(10,9)+7)).intValue();
    }
}

public class climbing_stairs {
    public static void main(String[] args) {
        Solution_climbing_stairs sol = new Solution_climbing_stairs();
        System.out.println(sol.climbStairs(84));
    }
}
