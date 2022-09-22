import java.util.Scanner;

public class quick_sort_1 {

    static void function(int[] arr,int index,int pivot){
        int temp = arr[index];
        for(int i=index;i>pivot;i--){
            arr[i] = arr[i-1];
        }
        arr[pivot] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pivot = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[pivot]){
                function(arr,i,pivot);
                pivot++;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
