import java.util.Scanner;

public class count_minimum_steps_for_desired_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int steps = 0;
        boolean allZeros = false;
        while (!allZeros){
            allZeros = true;
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    if(arr[i]!=1) {
                        allZeros = false;
                    }
                    if(arr[i]%2!=0){
                        arr[i]--;
                        steps++;
                    }
                }
            }
            if(!allZeros) {
                for (int i = 0; i < n; i++) {
                    arr[i] = arr[i]/2;
                }
                steps++;
            }
        }
        System.out.println(steps);
    }
}
