import java.util.Scanner;

public class insertion_sort_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // sorting
        for(int i=1;i<n;i++){
            int pos = -1;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    pos = j;
                    break;
                }
            }
            if(pos>-1){
                int temp = arr[i];
                for(int j=i-1;j>=pos;j--){
                    arr[j+1] = arr[j];
                }
                arr[pos] = temp;
            }
            // print
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
