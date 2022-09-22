import java.util.Scanner;

public class odd_integer_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(temp%2 != 0){
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}
