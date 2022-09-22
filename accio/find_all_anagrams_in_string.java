import java.util.HashMap;
import java.util.Scanner;

public class find_all_anagrams_in_string {

    static boolean compare(HashMap<Character,Integer> hmb,HashMap<Character,Integer> shm){
        for(char c: hmb.keySet()){
            if(!shm.containsKey(c)){
                return false;
            }else if(shm.get(c) != hmb.get(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int m = sc.nextInt();
        String b = sc.next();
        n = a.length();
        if(m>n){
            return;
        }else{
            HashMap<Character,Integer> hmb = new HashMap<>();
            for(char c:b.toCharArray()){
                if(hmb.containsKey(c)){
                    hmb.put(c,hmb.get(c)+1);
                }else{
                    hmb.put(c,1);
                }
            }
            HashMap<Character,Integer> shm = new HashMap<>();
            for(char c:a.substring(0,m).toCharArray()){
                if(shm.containsKey(c)){
                    shm.put(c,shm.get(c)+1);
                }else{
                    shm.put(c,1);
                }
            }
            int i = m;
            char[] crr = a.toCharArray();
            while (i<n){
                if(compare(hmb,shm)){
                    System.out.print(i-m+" ");
                }
                char push = crr[i];
                char pop = crr[i-m];
                if(shm.containsKey(push)){
                    shm.put(push,shm.get(push)+1);
                }else{
                    shm.put(push,1);
                }
                shm.put(pop,shm.get(pop)-1);
                i++;
            }
            if(compare(hmb,shm)){
                System.out.print(i-m);
            }
        }
    }
}
