import java.util.Scanner;

public class insertion_sort_simple {

    static void printArr(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[arr.length-1]){
                pos = i;
                break;
            }
        }
        int temp = arr[arr.length-1];
        for(int i=n-2;i>=pos;i--){
            arr[i+1] = arr[i];
            printArr(arr);
        }
        arr[pos] = temp;
        printArr(arr);
    }
}
