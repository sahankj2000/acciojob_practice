import java.util.Scanner;

public class max_ones_after_modification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int first = 0;
        int last = 0;
        int zcount = 0;
        int ans = 0;
        while (last<n){
            while (last<n){
                if(arr[last] == 0){
                    zcount++;
                    if(zcount > k){
                        break;
                    }
                }
                last++;
            }
            int size = last-first;
            if(size>ans){
                ans = size;
            }
            while (first<last && arr[first] == 1){
                first++;
            }
            if(first<n && arr[first] == 0){
                zcount--;
                first++;
            }
            last++;
        }
        System.out.println(ans);
    }
}
