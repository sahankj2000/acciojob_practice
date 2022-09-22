import java.util.Arrays;
import java.util.Scanner;

public class row_column_sorted_search {

    static int[] search(int[][] arr,int key){
        int[] loc = {-1,-1};
        int l = arr.length;
        int row = 0;
        int col = l-1;
        while (row<l && col>=0){
            if(arr[row][col] == key){
                loc[0] = row;
                loc[1] = col;
                return loc;
            }
            if(arr[row][col]>key){
                col--;
            }else {
                row++;
            }
        }
        return loc;
    }


    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    arr[j][k] = sc.nextInt();
                }
            }
            int[] loc = new int[2];
            loc =  search(arr,x);
            System.out.print(loc[0]+" "+loc[1]+" ");
        }
        /*
        int[][] arr = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        System.out.println(Arrays.toString(binary(arr,50)));
        */

    }
}
