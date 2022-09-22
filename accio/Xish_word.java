import java.util.Scanner;

public class Xish_word {
    static String word;

    static boolean isin(char c){
        for(char x:word.toCharArray()){
            if(x == c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        String xstring = sc.next();
        boolean flag = true;
        for(char c:xstring.toCharArray()){
            if(!isin(c)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
