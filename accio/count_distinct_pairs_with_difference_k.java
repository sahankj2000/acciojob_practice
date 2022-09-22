import java.util.HashMap;
import java.util.Scanner;

public class count_distinct_pairs_with_difference_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int count = 0;
        if(k == 0){
            for(int x:hm.keySet()){
                int temp = hm.get(x);
                if(temp>1){
                    count++;
                }
            }
        }
        else {
            for (int x : hm.keySet()) {
                if (hm.containsKey(x - k)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
