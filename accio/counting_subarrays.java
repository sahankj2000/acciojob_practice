import java.util.Scanner;

public class counting_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        int first = 0;
        int last = 0;
        long sum = arr[0];
        long count = 0;
        while (last<n){
            if(sum<k){
               last++;
               if(last >= first){
                   count+= last-first;
               }
               if(last<n){
                   sum+=arr[last];
               }
            }else{
                sum -= arr[first];
                first++;
            }
        }
        System.out.println(count);
    }
}
