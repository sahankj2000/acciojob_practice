import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class minim_swap_to_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        }
        Arrays.sort(arr);
        boolean[] been = new boolean[n];
        Arrays.fill(been,false);
        int i=0;
        int count = 0;
        while(i<n){
            if(been[i] == false && hm.get(arr[i])!= i){
                int j = i;
                int length = 0;
                while (!been[j]){
                    been[j] = true;
                    j = hm.get(arr[j]);
                    length++;
                }
                if(length>0){
                    count += length-1;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
