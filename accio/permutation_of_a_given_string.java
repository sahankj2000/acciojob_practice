import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_permutation_of_a_given_string {
    private List<String> list = new ArrayList<>();
    private boolean arr[];

    void helperFunction(StringBuilder sb,String str){
        if(sb.length() == arr.length){
            if(!list.contains(sb.toString())){
                list.add(sb.toString());
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(!arr[i]){
                    arr[i] = true;
                    sb.append(str.charAt(i));
                    helperFunction(sb,str);
                    sb.deleteCharAt(sb.length()-1);
                    arr[i] = false;
                }
            }
        }
    }

    public List<String> find_permutation(String str) {
        arr = new boolean[str.length()];
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        Arrays.fill(arr,false);
        helperFunction(new StringBuilder(),new String(ch));
        return list;
    }
}

public class permutation_of_a_given_string {
    public static void main(String[] args) {
        Solution_permutation_of_a_given_string sol = new Solution_permutation_of_a_given_string();
        for(String str:sol.find_permutation("ljr")){
            System.out.print(str+" ");
        }
    }
}
