import java.util.*;

class Solution_test{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int len;
        if(nums1.length == 0){
            len = nums2.length;
            if(len%2 == 0){
                return (double)(nums2[(int)(len/2)]+nums2[(int)(len/2)-1])/2;
            }
            return nums2[(int)(len/2)];
        }
        if(nums2.length == 0){
            len = nums1.length;
            if(len%2 == 0){
                return (double)(nums1[(int)(len/2)]+nums1[(int)(len/2)-1])/2;
            }
            return nums1[(int)(len/2)];
        }
        len = nums1.length+nums2.length;
        int[] merged = new int[len];
        int first = 0;
        int second = 0;
        int index = 0;
        while(true){
            if(nums1[first]<=nums2[second]){
                merged[index++] = nums1[first++];
            }else{
                merged[index++] = nums2[second++];
            }
            if(first == nums1.length){
                while(second != nums2.length){
                    merged[index++] = nums2[second++];
                }
                break;
            }
            if(second == nums2.length){
                while(first != nums1.length){
                    merged[index++] = nums1[first++];
                }
                break;
            }
        }
        if(len%2 == 0){
            return (double)(merged[(int)(len/2)]+merged[(int)(len/2)-1])/2;
        }
        return merged[(int)(len/2)];
    }
}
public class test{

    public static void main(String[] args) {
        Solution_test sol = new Solution_test();
        String s = "   -42";
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) || c == '-'){
                sb.append(c);
            }
        }
        System.out.println(String.valueOf(Long.MAX_VALUE).compareTo("20000000000000000000"));

        sb.charAt(0);
    }
}
