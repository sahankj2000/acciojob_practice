import java.util.Scanner;

public class kevin_and_his_fruits {

    static int eatFruits(int[] arr,int marker){
        int sum = 0;
        for(int x:arr){
            int temp = x-marker;
            if(temp>0){
                sum += temp;
            }
        }
        return sum;
    }

    /*
    static int searchSpace(int[] arr,int m,int largest){
        int first = 0;
        int last = largest;
        while (first<=last){
            int mid = (first+last)/2;
            int val = eatFruits(arr,mid);
            if(val == m){
                return mid;
            }
            if(val<m){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1;
    }
    */
    static int linear(int[] arr,int m,int largest){
        for(int i=largest;i>0;i--){
            if(eatFruits(arr,i)>=m){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(linear(arr,m,largest));
    }
}
