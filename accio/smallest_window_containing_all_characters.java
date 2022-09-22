import java.util.HashMap;
import java.util.Scanner;

public class smallest_window_containing_all_characters {

    static boolean compare(HashMap<Character,Integer> hmp,HashMap<Character,Integer> hms){
        for(char c:hmp.keySet()){
            if(hmp.get(c) > hms.getOrDefault(c,0)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] p = sc.next().toCharArray();
        HashMap<Character,Integer> hmp = new HashMap<>();
        for(char c:p){
            hmp.put(c, hmp.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> hms = new HashMap<>();
        int first = -1;
        int last = 0;
        int length = s.length+1;
        int findex = -1;
        int lindex = -1;
        hms.put(s[0],1);
        while (true){
            while (!compare(hmp,hms) && last<s.length-1){
                last++;
                hms.put(s[last],hms.getOrDefault(s[last],0)+1);
            }
            while (compare(hmp,hms) && first<last-1){
                first++;
                hms.put(s[first],hms.get(s[first])-1);
            }
            if(compare(hmp,hms) && first == last-1){
                first++;
            }
            int len = (last+1) - (first);
            if(len<length){
                length = len;
                findex = first;
                lindex = last;
            }
            if(last >= s.length-1){
                break;
            }else{
                last++;
                hms.put(s[last],hms.getOrDefault(s[last],0)+1);
            }
        }
        if(findex == -1 || lindex == -1){
            System.out.println(-1);
        }else {
            //System.out.println(length);
            for (int i = findex; i <= lindex; i++) {
                System.out.print(s[i]);
            }
        }
    }
}
