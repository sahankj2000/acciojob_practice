import java.util.Scanner;

public class super_digit {

    static String superDigit(String number){
        if(number.length() == 1){
            return number;
        }
        int sum = 0;
        for(char x:number.toCharArray()){
            sum += Integer.parseInt(""+x);
        }
        return superDigit(Integer.valueOf(sum).toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        String actual = "";
        for(int i=1;i<=k;i++){
            actual += n;
        }
        System.out.println(superDigit(actual));
    }
}
