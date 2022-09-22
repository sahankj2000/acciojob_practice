import java.util.HashMap;
import java.util.Scanner;

public class first_element_to_occur_k_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        boolean found = false;
        for(int x:arr){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
                if(hm.get(x) == k){
                    System.out.println(x);
                    found = true;
                    break;
                }
            }else{
                hm.put(x,1);
            }
        }
        if(!found){
            if(k == 1){
                for(int x:arr){
                    if(hm.get(x) == 1){
                        System.out.println(x);
                        //break;
                    }
                }
            }else
            System.out.println(-1);
        }
    }
}
