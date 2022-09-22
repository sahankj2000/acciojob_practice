import java.util.Scanner;

public class icecream_parlor {

    static Scanner sc;

    static void eachCase(){
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(cost[i]+cost[j] == k){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            eachCase();
        }
        sc.close();
    }
}
