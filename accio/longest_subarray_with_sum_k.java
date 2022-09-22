import java.util.HashMap;
import java.util.Scanner;

public class longest_subarray_with_sum_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> sumhm = new HashMap<>();
        int sum = 0;
        int length = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                length = i+1;
            }
            if(!sumhm.containsKey(sum)){
                sumhm.put(sum,i);
            }
            if(sumhm.containsKey(sum-k)){
                int len = i - sumhm.get(sum-k);
                if(len>length){
                    length = len;
                }
            }
        }
        System.out.println(length);
    }
}
