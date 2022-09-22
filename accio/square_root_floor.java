import java.util.Scanner;

public class square_root_floor {

    static long search(long num){
        long first = 0;
        long last = num/2;
        while (first<=last){
            long mid = (first+last)/2;
            long square = mid*mid;
            if(square <= num){
                if((mid+1)*(mid+1) > num){
                    return mid;
                }else{
                    first = mid+1;
                }
            }else{
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(search(n));
    }
}
