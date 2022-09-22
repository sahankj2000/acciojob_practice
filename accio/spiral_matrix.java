import java.util.ArrayList;
import java.util.List;

class Solution_spiral_matrix{
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int rowBeg = 0;
        int rowEnd = mat.length-1;
        int colBeg = 0;
        int colEnd = mat[0].length-1;
        while (rowBeg<=rowEnd || colBeg<=colEnd){
            if(rowBeg<=rowEnd) {
                for (int i = colBeg; i <= colEnd; i++) {
                    list.add(mat[rowBeg][i]);
                }
            }
            rowBeg++;
            if(colBeg<=colEnd) {
                for (int i = rowBeg; i <= rowEnd; i++) {
                    list.add(mat[i][colEnd]);
                }
            }
            colEnd--;
            if(rowBeg<=rowEnd) {
                for (int i = colEnd; i >= colBeg; i--) {
                    list.add(mat[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colBeg<=colEnd) {
                for (int i = rowEnd; i >= rowBeg; i--) {
                    list.add(mat[i][colBeg]);
                }
            }
            colBeg++;
        }
        return list;
    }
}

public class spiral_matrix {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int[][] mat = {{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
        int[][] mat = {{1,2},{3,4}};
        Solution_spiral_matrix sol = new Solution_spiral_matrix();
        for(Integer x: sol.spiralOrder(mat)){
            System.out.print(x+" ");
        }
    }
}
