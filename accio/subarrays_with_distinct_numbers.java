import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class subarrays_with_distinct_numbers {

    static int atmostK(int[] arr,int k){
        int count = 0;
        int first = 0;
        int last = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while (last<arr.length){
            hm.put(arr[last],hm.getOrDefault(arr[last],0)+1);
            while (hm.size()>k){
                hm.put(arr[first],hm.get(arr[first])-1);
                if(hm.get(arr[first]) == 0){
                    hm.remove(arr[first]);
                }
                first++;
            }
            count += last - first + 1;
            last++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(atmostK(arr,k)-atmostK(arr,k-1));
    }
}
