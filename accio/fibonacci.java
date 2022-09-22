import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        if(n == 0){
            System.out.println(00);
        }else if (n == 1){
            System.out.println(01);
        }else{
            for(int i=2;i<=n;i++){
                BigInteger temp = a.add(b);
                a = b;
                b = temp;
            }
            String ans = b.toString();
            if(ans.length() == 1){
                System.out.println(0+ans);
            }else {
                System.out.println(ans.substring(ans.length() - 2));
            }
        }
    }
}
