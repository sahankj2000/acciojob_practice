import java.util.HashMap;

class Solution_car_pooling{
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        for(int[] trip:trips){
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }
        int passengers = 0;
        for(int i=0;i<=arr.length;i++){
            passengers += arr[i];
            if(passengers>capacity){
                return false;
            }
        }
        return true;
    }
}

public class car_pooling {
    public static void main(String[] args) {
        int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 4;
        Solution_car_pooling sol = new Solution_car_pooling();
        System.out.println(sol.carPooling(trips,capacity));
    }
}
