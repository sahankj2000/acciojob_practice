import java.util.HashMap;
import java.util.Scanner;

public class k_anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        //System.out.println(a+" "+b);
        if(a.length() == b.length()){
            HashMap<Character,Integer> hma = new HashMap<>();
            HashMap<Character,Integer> hmb = new HashMap<>();
            for(char c:a.toCharArray()){
                hma.put(c,hma.getOrDefault(c,0)+1);
            }
            for(char c:b.toCharArray()){
                hmb.put(c,hmb.getOrDefault(c,0)+1);
            }
            int diff = 0;
            for(char c:hma.keySet()){
                diff += hma.get(c)-hmb.getOrDefault(c,0);
            }
            if(diff<=k){
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
