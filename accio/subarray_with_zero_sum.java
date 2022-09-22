import java.util.HashMap;
import java.util.Scanner;

public class subarray_with_zero_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Boolean> hm = new HashMap<>();
        int sum = 0;
        boolean found = false;
        for(int x:arr){
            sum += x;
            if(x == 0 || hm.containsKey(sum)){
                found = true;
                System.out.println("YES");
                break;
            }else{
                hm.put(sum,true);
            }
        }
        if(!found){
            System.out.println("NO");
        }
    }
}
