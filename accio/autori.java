import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        String[] names = line.split("-");
        for(String s:names) {
            System.out.print(s.charAt(0));
        }
    }
}
