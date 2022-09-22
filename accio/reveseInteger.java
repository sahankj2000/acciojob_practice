import java.util.Scanner;

public class reveseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        if(n>0){
            while (n>0){
                int x = n%10;
                rev = (rev*10)+x;
                n = n/10;
            }
            if(rev>0){
                System.out.println(rev);
            }else{
                System.out.println(0);
            }
        } else if (n<0) {
            if(n == Integer.MIN_VALUE){
                System.out.println(0);
            }else {
                n = Math.abs(n);
                while (n > 0) {
                    int x = n % 10;
                    rev = (rev * 10) + x;
                    n = n / 10;
                }
                if (rev > 0) {
                    System.out.println(rev*-1);
                }else {
                    System.out.println(0);
                }
            }
        } else {
            System.out.println(0);
        }
    }
}
