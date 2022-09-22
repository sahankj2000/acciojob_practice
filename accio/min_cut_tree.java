import java.util.Scanner;

public class min_cut_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heights = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            heights[i] = temp;
            if(temp>max){
                max = temp;
            }
        }
        for(int i=1;i<=max;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                int temp = heights[j] - i;
                if(temp>0){
                    sum += temp;
                }
            }
            if(sum<=k){
                System.out.println(i);
                break;
            }
        }
    }
}
