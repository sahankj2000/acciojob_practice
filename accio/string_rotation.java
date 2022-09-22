import java.util.Scanner;

public class string_rotation {

    static String oneRotate(String str){
        String ans = ""+str.charAt(str.length()-1);
        for(int i=0;i<str.length()-1;i++){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        
        boolean flag = false;
        for(int i=0;i<str1.length();i++){
            if(str1.compareTo(str2) == 0){
                flag = true;
                break;
            }
            str2 = oneRotate(str2);
        }

        if(flag){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
