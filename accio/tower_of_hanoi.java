import java.util.Scanner;

public class tower_of_hanoi {
    static void hanoi(int disk,char sour,char dest,char aux){
        if(disk == 0){
            return;
        }
        hanoi(disk-1,sour,aux,dest);
        System.out.print(sour+"->"+dest+" ");
        hanoi(disk-1,aux,dest,sour);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n,'A','C','B');
    }
}
