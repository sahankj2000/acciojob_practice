import java.util.HashMap;
import java.util.Scanner;

public class first_non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] arr = new char[26];
        int index = 0;
        for(char c:str.toCharArray()){
            if(!hm.containsKey(c)){
                arr[index] = c;
                index++;
                hm.put(c,1);
            }else{
                hm.put(c,hm.get(c)+1);
            }
        }
        boolean found = false;
        for(int i=0;i<index;i++){
            if(hm.get(arr[i])== 1){
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}
