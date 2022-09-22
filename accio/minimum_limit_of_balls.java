import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class minimum_limit_of_balls {

    static int getLargest(int[] arr){
        int largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    static boolean helper(int[] arr,int target,int max){
        if(target == 0){
            return max+1 > 0;
        }
        int count = 0;
        for(int x:arr){
            count += (x-1)/target;
        }
        return count<=max;
    }

    static int findMinPenalty(int[] arr,int max){
        int sum = 0;
        for(int x:arr){
            sum += x;
        }
        int left = Math.max(sum/(arr.length+max),1);
        int right = getLargest(arr);
        while(left<right){
            int mid = (left+right)/2;
            if(helper(arr,mid,max)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMinPenalty(arr,m));
    }
}
