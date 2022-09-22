import java.util.Scanner;

public class trailing_zeroes_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while(n >= 5){
          n = n/5;
          sum += n;
        }
        System.out.println(sum);
    }
}
