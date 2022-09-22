import java.util.HashMap;
import java.util.Scanner;

public class most_frequent_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        int length = 0;
        String[] temp = new String[n];
        int highest = 1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
                int x = hm.get(arr[i]);
                if(x>highest){
                    highest = x;
                }
            }else{
                hm.put(arr[i],1);
                temp[length] = arr[i];
                length++;
            }
        }
        for(int i=length-1;i>=0;i--){
            if(hm.get(temp[i]) == highest){
                System.out.print(temp[i]);
                break;
            }
        }
    }
}
