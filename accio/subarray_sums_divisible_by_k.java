import java.util.HashMap;
import java.util.Scanner;

public class subarray_sums_divisible_by_k {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        for(int x:arr){
            sum = (sum+x);
            int mod = ((sum%k)+k)%k;
            hm.put(mod, hm.getOrDefault(mod,0)+1);
        }
        int count = 0;
        for(int x:hm.keySet()){
            int freq = hm.get(x);
            if(freq>1){
                count += (freq*(freq-1))/2;
            }
        }
        count += hm.getOrDefault(0,0);
        System.out.println(count);
    }
}
