import java.util.HashMap;

class Solution_max_distance_between_same_elements{
    int maxDistance(int arr[], int n) {
        int length = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }else{
                if(length<i-hm.get(arr[i])){
                    length = i-hm.get(arr[i]);
                }
            }
        }
        return length;
    }
}


public class max_distance_between_same_elements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        Solution_max_distance_between_same_elements sol = new Solution_max_distance_between_same_elements();
        System.out.println(sol.maxDistance(arr,arr.length));
    }
}
