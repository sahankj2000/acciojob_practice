import java.util.Scanner;

/**
 * kAnagram
 */

// 8 pwijzpmjilfzrrr vhvlokivxmwxgnc 
// expected:0

public class kAnagram {

    public static void main(String[] args) throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int k = Integer.parseInt(line[0]);
        String str1 = line[1];
        String str2 = line[2];
        int[] hash_a = new int[26];
        int[] hash_b = new int[26];
        int minus = (int)'a';

        int count = 0;
        if(str1.length() == str2.length()){
            for(int i=0;i<str1.length();i++){
                hash_a[str1.charAt(i)-minus] += 1;
            }
            for(int i=0;i<str2.length();i++){
                hash_b[str2.charAt(i)-minus] += 1;
            }
            
            for(int i=0;i<hash_a.length;i++){
                if(hash_a[i]>hash_b[i]){
                    count += hash_a[i] - hash_b[i];
                }
            }

            if(count <= k){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else{
            System.out.println(0);
        }
        sc.close();
    }
}