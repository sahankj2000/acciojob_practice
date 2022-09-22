import java.util.LinkedList;
import java.util.Scanner;

public class compare_two_ll {
    public static void main(String[] args) {

        // initialising and taking inputs
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i=0;i<m;i++){
          l1.add(sc.nextInt());
        }
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
          l2.add(sc.nextInt());
        }

        // printing two linked lists
        for(Integer x:l1){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
        for(Integer x:l2){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();


        boolean flag = true;
        if(m==n){
            for(int i=0;i<n;i++){
                if(l1.get(i).intValue()!=l2.get(i).intValue()){
                    System.out.println(0);
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(1);
            }
        }else{
          System.out.println(0);
        }
        sc.close();
    }
}
