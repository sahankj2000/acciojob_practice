import java.util.Scanner;

public class floor_in_sorted_array {

    static int findFloor(int[] arr,int x){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]<=x){
                if(mid==arr.length-1||arr[mid+1]>x){
                    return mid;
                }
            }
            if(arr[mid]<x){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findFloor(arr,x));
    }
}
