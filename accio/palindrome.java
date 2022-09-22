import java.util.Scanner;

public class palindrome {

    static boolean ispalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp/10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(ispalindrome(num));
    }
}
