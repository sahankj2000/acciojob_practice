import java.util.LinkedList;
import java.util.Scanner;
public class Delete_a_node
{
    public static void main (String[] args) throws java.lang.Exception
    {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        ll.remove(sc.nextInt());
        while (!ll.isEmpty()){
            System.out.print(ll.pop()+" ");
        }
    }
}
