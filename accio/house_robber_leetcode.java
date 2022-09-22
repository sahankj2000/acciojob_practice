public class house_robber_leetcode {

    static int func(int[] nums,int n){
        if(n<0){
            return 0;
        }
        int a = nums[n] + func(nums,n-2);
        int b = func(nums,n-1);
        return Math.max(a,b);
    }

    static int newFunc(int[] nums,int n){
        int remaining = (nums.length-1)-n;
        if(remaining < 3){
            if(remaining == 2){
                return Math.max(nums[n]+nums[n+2],nums[n+1]);
            }else if(remaining == 1){
                return Math.max(nums[n],nums[n+1]);
            }
            return nums[n];
        }
        if(nums[n]>nums[n+1]){
            return nums[n]+newFunc(nums,n+2);
        }else{
            if(nums[n+1]+nums[n+3]>nums[0]+nums[2]){
                return nums[n+1]+newFunc(nums,n+3);
            }else{
                return nums[n]+newFunc(nums,n+2);
            }
        }
    }

    static int rob(int[] nums){
        return func(nums,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,4,3,3,6,1,1,9};
        System.out.println(newFunc(nums,0));
    }
}
