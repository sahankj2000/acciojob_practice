import java.util.Scanner;

public class shipping_packages {
    static int days;

    static boolean possibleShift(int[] arr,int cap){
        int temp = 0;
        int count = 0;
        for(int x:arr){
            if(temp+x>cap){
                temp = x;
                count++;
            }else {
                temp+=x;
            }
            if(count>=days){
                return false;
            }
        }
        return true;
    }

    static int search(int[] arr,int sum,int max){ // max = first, sum = last
        int latestPossible = max;
        while (max<=sum){
            int mid = (max+sum)/2;
            boolean possible = possibleShift(arr,mid);
            if(!possible){
                max = mid+1;
            }else {
                latestPossible = mid;
                sum = mid-1;
            }
        }
        return latestPossible;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            sum += input;
            if(input>max){
                max = input;
            }
            arr[i] = input;
        }
        days = sc.nextInt();
        System.out.println(search(arr,sum,max));
    }
}
