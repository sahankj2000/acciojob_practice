import java.util.HashMap;

class Solution_longest_palindrome{
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for(char c:hm.keySet()){
            if(hm.get(c)%2==0){
                evenSum += hm.get(c);
                evenCount++;
            }else{
                oddSum += hm.get(c);
                oddCount++;
            }
        }
        if(oddCount>0) {
            return evenSum + oddSum - oddCount + 1;
        }
        return evenSum;
    }
}

public class longest_palindrome {
    public static void main(String[] args) {
        Solution_longest_palindrome sol = new Solution_longest_palindrome();
        System.out.println(sol.longestPalindrome("aa"));
    }
}
