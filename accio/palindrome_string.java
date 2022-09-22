import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                a.append(Character.toLowerCase(c));
                b.append(Character.toLowerCase(c));
            } else if (Character.isDigit(c)) {
                a.append(c);
                b.append(c);
            }
        }
        b.reverse();
        System.out.println(a);
        System.out.println(b);
        if(a.compareTo(b)==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
