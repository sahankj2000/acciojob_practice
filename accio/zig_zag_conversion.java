import java.util.Arrays;

class Solution_zig_zag_conversion{
    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        int index = 0;
        int sindex = 0;
        for(int i=0;i<numRows;i++){
            arr[i] = new StringBuilder();
        }
        while (sindex<s.length()){
            while(index<numRows && sindex<s.length()){
                arr[index++].append(s.charAt(sindex++));
            }
            index-=2;
            while (index>=0 && sindex<s.length()){
                arr[index--].append(s.charAt(sindex++));
            }
            index+=2;
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder str:arr){
            sb.append(str.toString());
        }
        return sb.toString();
    }
}

public class zig_zag_conversion {
    public static void main(String[] args) {
        Solution_zig_zag_conversion sol = new Solution_zig_zag_conversion();
        System.out.println(sol.convert("PAYPALISHIRING",3));
    }
}
