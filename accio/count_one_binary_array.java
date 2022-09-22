import java.util.Scanner;

public class count_one_binary_array {

    static int binary(int[] arr){
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        while (first<=last){
            mid = (first+last)/2;
            if(arr[mid] == 1 && (mid != last && arr[mid+1] == 0)){
                break;
            }else{
                if(arr[mid] == 1){
                    first = mid+1;
                }else{
                    last = mid-1;
                }
            }
        }
        if(arr[mid]!=0)
            return mid+1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(binary(arr));
    }
}
