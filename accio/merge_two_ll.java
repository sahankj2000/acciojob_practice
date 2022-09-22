import java.util.LinkedList;
import java.util.Scanner;

public class merge_two_ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        while(i<n&&j<m){
            if(l1.get(i)<=l2.get(j)){
                l3.add(l1.get(i));
                i++;
            }else{
                l3.add(l2.get(j));
                j++;
            }
        }
        while(i<n){
            l3.add(l1.get(i));
            i++;
        }
        while(j<m){
            l3.add(l2.get(j));
            j++;
        }
        for(Integer x:l3){
            System.out.print(x);
            System.out.print(" ");
        }
        sc.close();
    }
}
