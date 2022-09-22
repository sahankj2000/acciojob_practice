class Solution_largest_number {

    void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    boolean lessThan(int first,int second){
        String a = String.valueOf(first);
        String b = String.valueOf(second);
        if(Long.parseLong(a+b)<Long.parseLong(b+a)){
            return true;
        }
        return false;
    }
    int merge(int[] arr,int first,int last){
        int index = first;
        for(int i=first+1;i<=last;i++){
            if(!lessThan(arr[i],arr[first])){
                swap(arr,++index,i);
            }
        }
        swap(arr,first,index);
        return index;
    }

    void quickSort(int[] arr,int first,int last){
        if(first<last && first>=0 && last<arr.length){
            int index = merge(arr,first,last);
            quickSort(arr,first,index-1);
            quickSort(arr,index+1,last);
        }
    }

    public String largestNumber(int[] nums) {
        quickSort(nums,0,nums.length-1);
        String str = "";
        if(nums[0] == 0){
            return "0";
        }
        for(int x:nums){
            str += String.valueOf(x);
        }
        return str;
    }
}

public class largest_number {
    public static void main(String[] args) {
        Solution_largest_number sol = new Solution_largest_number();
        int[] arr = {10,2};
        System.out.println(sol.largestNumber(arr));
    }
}
