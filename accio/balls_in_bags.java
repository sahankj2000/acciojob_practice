import java.util.Scanner;

public class balls_in_bags {

    static int largest(int[] arr){
        int large = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                index = i;
                large = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+m];
        int index = n;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        while (m!=0){
            int l_index = largest(arr);
            if(arr[l_index]%2!=0){
                arr[l_index] = (arr[l_index]/2);
                arr[index] = arr[l_index]+1;
            }else{
                arr[l_index] = (arr[l_index]/2);
                arr[index] = arr[l_index];
            }
            index++;
            m--;
        }
        System.out.println(arr[largest(arr)]);
    }
}
