import java.util.Scanner;

public class ptice {

    static char getAdriansAnswer(int index){
        index = index%3;
        if(index == 0){
            return 'A';
        }
        if (index == 1) {
            return 'B';
        }
        return 'C';
    }

    static char getBrunosAnswer(int index){
        index = index%4;
        if(index == 0 || index == 2){
            return 'B';
        }
        if(index == 1){
            return 'A';
        }
        return 'C';
    }

    static char getGoransAnswer(int index){
        index = index%6;
        if(index < 2){
            return 'C';
        }
        if(index<4){
            return 'A';
        }
        return 'B';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int adrian = 0;
        int bruno = 0;
        int goran = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == getAdriansAnswer(i)){
                adrian++;
            }
            if(c == getBrunosAnswer(i)){
                bruno++;
            }
            if(c == getGoransAnswer(i)){
                goran++;
            }
        }
        int max = 0;
        if(max<adrian){
            max = adrian;
        }
        if(max<bruno){
            max = bruno;
        }
        if(max<goran){
            max = goran;
        }
        System.out.println(max);
        if(max == adrian) {
            System.out.println("Adrian");
        }
        if(max == bruno){
            System.out.println("Bruno");
        }
        if(max == goran){
            System.out.println("Goran");
        }
    }
}
