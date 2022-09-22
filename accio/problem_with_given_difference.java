import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem_with_given_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int diff = sc.nextInt();

        if(diff>2000){
            System.out.println(0);
        }else {
            boolean found = false;
            ArrayList<Integer> list = new ArrayList<>();
            for(int x:arr){
                if(!list.contains(x)){
                    list.add(x);
                }
            }
            Collections.sort(list);
            for(Integer x:list){
                if(x.intValue()+diff>2000){
                    break;
                }
                if(list.contains(x.intValue()+diff)){
                    found = true;
                }
            }
            if(found){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
