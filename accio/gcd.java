import java.util.Scanner;

public class gcd {
    static int GCD(int a,int b){
        int gcd = 1;
        int i = 1;
        while(i<=a && i<=b){
          if(a%i == 0 && b%i == 0){
            gcd = i;
          }
          i++;
        }
        return gcd;
      }
    
      public static void main (String[] args) throws java.lang.Exception
      {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println(GCD(n1,n2));
      }
}
