import java.util.Scanner;

public class first_and_last_position_in_sorted {

    static int firstOccurance(long[] arr,long key){
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            if(first == last && arr[first] == key){
                return first;
            }
            int mid = (first+last)/2;
            if(arr[mid]<key){
                first = mid+1;
            }else if(arr[mid]>key){
                last = mid-1;
            }else{
                if(mid-1 >= 0){
                    if(arr[mid-1] < key) {
                        return mid;
                    }else {
                        last = mid-1;
                    }
                }
            }
        }
        return -1;
    }

    static int lastOccurance(long[] arr,long key){
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            if(first == last && arr[first] == key){
                return first;
            }
            int mid = (first+last)/2;
            if(arr[mid]<key){
                first = mid+1;
            }else if(arr[mid]>key){
                last = mid-1;
            }else{
                if(mid<arr.length-1){
                    if(arr[mid+1]>key){
                        return mid;
                    }else {
                        first = mid+1;
                    }
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //long key = sc.nextLong();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long key = sc.nextLong();
        System.out.println(firstOccurance(arr,key)+" "+lastOccurance(arr,key));
    }
}
