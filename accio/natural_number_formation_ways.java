import java.util.Scanner;

public class natural_number_formation_ways {
    private static int n;
    private static int count;

    static void function(int index,int sum){
        if(sum == n){
            count++;
        }else if(sum < n){
            for(int i=index+1;i<=n;i++){
                function(i,i+sum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        function(0,0);
        System.out.println(count);
    }
}
