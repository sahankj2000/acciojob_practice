class Solution_max_product_subarray{
    public int maxProduct(int[] arr) {
        int first = 0;
        int last = 0;
        int largest = Integer.MIN_VALUE;
        int product = 1;
        while (last<arr.length){
            while (last<arr.length){
                if(arr[last]!=0){
                    product *= arr[last];
                    if(product>largest){
                        largest = product;
                    }
                    last++;
                }else{
                    if(largest<0){
                        largest = 0;
                    }
                    last--;
                    break;
                }
            }
            if(last == arr.length){
                last--;
            }
            while (first<last){
                product /= arr[first];
                if(product>largest){
                    largest = product;
                }
                first++;
            }
            if(last+2<arr.length){
                last+=2;
                first = last;
                product = 1;
            }else{
                break;
            }
        }
        return largest;
    }
}

public class max_product_subarray {
    public static void main(String[] args) {
        int[] arr = {0};
        Solution_max_product_subarray sol = new Solution_max_product_subarray();
        System.out.println(sol.maxProduct(arr));
    }
}
