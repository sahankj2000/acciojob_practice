import java.util.Scanner;

public class sorted_rotated_array {

    static int shifts;

    static int customIndexing(int[] arr,int index){
        return arr[(index+shifts)%(arr.length)];
    }

    static int binarySearch(int[] arr,int val){
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        while (first<=last){
            mid = (first+last)/2;
            if(customIndexing(arr,mid) == val){
                if(mid != 0){
                    if(customIndexing(arr,mid-1) < val)
                        break;
                }else{
                    break;
                }
            }
            if(val <= customIndexing(arr,mid)){
                last = mid-1;
            }else {
                first = mid+1;
            }
        }
        if(customIndexing(arr,mid) == val)
            return mid;
        else
            return -1;
    }

    static int getHighestIndex(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            int mid = (first+last)/2;
            if(mid == arr.length-1 || (arr[mid]>arr[mid+1])){
                return mid;
            }
            if(arr[first]>arr[mid]){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return arr.length-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = getHighestIndex(arr);
        shifts = (temp+1)%(arr.length);
        int index = binarySearch(arr,k);
        if(index>-1)
            System.out.println((index+shifts)%arr.length);
        else
            System.out.println(-1);
    }
}
