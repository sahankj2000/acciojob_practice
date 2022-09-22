import java.util.Scanner;

public class test2 {
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
        for(int i=0;i<20;i++){
            System.out.println(getAdriansAnswer(i)+""+getBrunosAnswer(i)+getGoransAnswer(i));
        }
    }
}
