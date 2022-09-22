import java.util.Scanner;

public class counting_inversions {

    static int count = 0;

    static void swap(int[] arr,int a,int b){
        count++;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] ans = new int[d];
        int x = 0;
        for(int k=0;k<d;k++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                boolean swaped = false;
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swaped = true;
                        swap(arr, j, j + 1);
                    }
                }
                if (!swaped) {
                    break;
                }
            }
            ans[x++] = count;
            count = 0;
        }
        for(int val:ans){
            System.out.println(val);
        }
    }
}
