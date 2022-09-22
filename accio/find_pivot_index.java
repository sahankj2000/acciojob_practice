class Solution_find_pivot_index{
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            pre[i] = sum;
        }
        if(0==pre[n-1]-pre[0]){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(pre[i-1] == pre[n-1]-pre[i]){
                return i;
            }
        }
        return -1;
    }
}

public class find_pivot_index {
    public static void main(String[] args) {
        //int[] arr = {1,-1,2};
        int[] arr = {1,7,3,6,5,6};
        Solution_find_pivot_index sol = new Solution_find_pivot_index();
        System.out.println(sol.pivotIndex(arr));
    }
}
