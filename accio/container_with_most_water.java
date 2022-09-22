import java.util.Scanner;

public class container_with_most_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxArea = 0;
        int first = 0;
        int last = n-1;
        while (first<last){
            int temp = (last-first)*Math.min(arr[first],arr[last]);
            if(temp>maxArea){
                maxArea = temp;
            }
            if(arr[first]<arr[last]){
                first++;
            }else{
                last--;
            }
        }
        System.out.println(maxArea);
    }
}
