import java.util.Arrays;
import java.util.Scanner;

public class allocate_books {

    static boolean assignBooks(int[] books,int students,long estimatedPages){
        int scount = 1;
        long pageCounter = 0;
        for(int i=0;i<books.length;i++){
            if(pageCounter+books[i]>estimatedPages){
                if(books[i]>estimatedPages){
                    return false;
                }
                pageCounter = books[i];
                scount++;
            }else{
                pageCounter+=books[i];
            }
        }
        return students >= scount;
    }

    static long search(int[] books,int fs,long last,int students){
        long first = fs;
        while (first<=last){
            long mid = (first+last)/2;
            if(assignBooks(books,students,mid)){
                if(!assignBooks(books,students,mid-1)){
                    return mid;
                }
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        int largest = -1;
        long sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            sum += arr[i];
        }

        if(b>n){
            System.out.println(-1);
        }else{
            System.out.println(search(arr,largest,sum,b));
        }
    }
}
