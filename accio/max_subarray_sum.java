public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-10};
        int n = arr.length;
        int sum = 0;
        int largest = -1;
        int largest_number = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > largest){
                largest = sum;
            }
            if(arr[i]>largest_number){
                largest_number = arr[i];
            }
            if(sum<0){
                sum = 0;
            }
        }
        int ans = 0;
        if(largest<0){
            ans = largest_number;
        }else {
            ans = largest;
        }
        System.out.println(ans);
    }
}
