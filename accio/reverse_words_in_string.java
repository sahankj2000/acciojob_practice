import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution_reverse_words_in_string{
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index<s.length()){
            char c = s.charAt(index);
            if(c != ' '){
                sb.append(c);
            }else{
                if(sb.length()!=0){
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
            index++;
        }
        if(sb.length()!=0){
            list.add(sb.toString());
        }
        sb.setLength(0);
        for(int i=list.size()-1;i>0;i--){
            sb.append(list.get(i)+" ");
            list.remove(i);
        }
        sb.append(list.get(0));
        return sb.toString();
    }
}

public class reverse_words_in_string {
    public static void main(String[] args) {
        Solution_reverse_words_in_string sol = new Solution_reverse_words_in_string();
        System.out.println("\""+sol.reverseWords(" Hello World ")+"\"");
    }
}
