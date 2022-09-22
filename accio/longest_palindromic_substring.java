class Solution_longest_palindromic_substring{
    int length = 0;
    String ans;

    boolean isPalindrome(String str,int first,int last){
        while (first<=last){
            if(str.charAt(first) != str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        for(int i=0;i<s.length()-1;i++){
            for(int j=s.length()-1;j>i;j--){
                if(j-i>length){
                    if(isPalindrome(s,i,j)){
                        ans = s.substring(i,j+1);
                        length = j-i;
                    }
                }else{
                    break;
                }
            }
        }
        if(length == 0){
            return ""+s.charAt(0);
        }else{
            return ans;
        }
    }
}

public class longest_palindromic_substring {
    public static void main(String[] args) {
        Solution_longest_palindromic_substring sol = new Solution_longest_palindromic_substring();
        System.out.println(sol.longestPalindrome("aacabdkacaa"));
    }
}
