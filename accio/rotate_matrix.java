public class rotate_matrix {

    static void rotate(int[][] mat) {
        int n = mat[0].length;
        int start = 0;
        for(int i=n-1;i>0;i=i-2){
            for(int j=0;j<i;j++){
                int one = start;
                int two = n-start-1;
                int temp = mat[one][one+j];
                mat[one][one+j] = mat[two-j][one];
                mat[two-j][one] = mat[two][two-j];
                mat[two][two-j] = mat[one+j][two];
                mat[one+j][two] = temp;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] mat = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int n = mat[0].length;

        rotate(mat);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
