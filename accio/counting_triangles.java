import java.util.Arrays;
import java.util.Scanner;

public class counting_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long modval = (long) (Math.pow(10,9)+7);
        long count = 0;
        for(int k=n-1;k>1;k--){
            int j = k-1;
            int i = 0;
            while(i<j){
                if(arr[i]+arr[j]>arr[k]){
                    count = (count+(j-i))%modval;
                    j--;
                }else{
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
