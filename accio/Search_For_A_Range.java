import java.util.Scanner;

public class Search_For_A_Range {

    static int firstOccurence(long[] arr,long key){
        int first = 0;
        int last = arr.length-1;
        int temp = -1;
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid]>key){
                last = mid -1;
            }else if(arr[mid]<key){
                first = mid+1;
            }else{
                temp = mid;
                last = mid-1;
            }
        }
        return temp;
    }

    static int lastOccurence(long[] arr,long key){
        int first = 0;
        int last = arr.length-1;int temp = -1;
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid]>key){
                last = mid -1;
            }else if(arr[mid]<key){
                first = mid+1;
            }else{
                temp = mid;
                first = mid+1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long key = sc.nextLong();
        System.out.println(firstOccurence(arr,key)+" "+lastOccurence(arr,key));
    }
}
