import java.util.Scanner;

public class find_the_median {

    static int[] arr;
    static int index;

    static void bubbleSort(){
        while(true) {
            boolean sorted = true;
            for(int i=0;i<index-1;i++){
                if(arr[i]>arr[i+1]){
                    sorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if(sorted){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[index] = sc.nextInt();
            index++;
        }
        bubbleSort();
        System.out.println(arr[n/2]);
    }
}
