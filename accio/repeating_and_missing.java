import java.util.Arrays;
import java.util.Scanner;

public class repeating_and_missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,false);
        arr[0] = true;
        int rep = -1;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(!arr[x]){
                arr[x] = true;
            }else{
                rep = x;
            }
        }
        int missing = -1;
        for(int i=0;i<=n;i++){
            if(!arr[i]){
                missing = i;
                break;
            }
        }
        System.out.println(rep+" "+missing);
    }
}
