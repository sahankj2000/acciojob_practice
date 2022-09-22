import java.util.Scanner;

public class binary_search {

    static int binarySearch(int[] arr,int val){
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        while (first<=last){
            mid = (first+last)/2;
            if(arr[mid] == val){
                if(mid != 0){
                    if(arr[mid-1] < val)
                        break;
                }else{
                    break;
                }
            }
            if(val <= arr[mid]){
                last = mid-1;
            }else {
                first = mid+1;
            }
        }
        if(arr[mid] == val)
            return mid+1;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr,k));
    }
}
