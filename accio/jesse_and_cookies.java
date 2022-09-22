import java.util.Scanner;

/**
 * jesse_and_cookies
 */
public class jesse_and_cookies {

    static int[] fullSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] customSort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        return arr;
    }

    static boolean check(int arr[],long k){
        for(int x:arr){
            if(x<k){
                return false;
            }
        }
        return true;
    }

    static int[] combineCookies(int arr[]){
        int[] combined = new int[arr.length -1];
        combined[0] = (arr[0]+2*arr[1]);
        for(int i=2;i<arr.length;i++){
            combined[i-1] = arr[i];
        }
        return combined;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = fullSort(arr);
        sc.close();
        int count = 0;

        while(!check(arr, k)&&arr.length>1){
            count++;
            arr = customSort(combineCookies(arr));
        }
        if(!check(arr, k)){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }
}