import java.util.HashMap;
import java.util.Scanner;

public class missing_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<m;i++){
            if(hm.containsKey(brr[i])) {
                hm.put(brr[i], hm.get(brr[i]) + 1);
            }else{
                hm.put(brr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) - 1);
            }else{
                hm.put(arr[i],-1);
            }
        }
        for(Integer x: hm.keySet()){
            if(hm.get(x)!=0){
                System.out.print(x+" ");
            }
        }
    }
}
