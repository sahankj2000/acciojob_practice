import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution_combination_sum_3{
    List<List<Integer>> mainList = new ArrayList<>();

    List<Integer> clone(List<Integer> list){
        List<Integer> copy = new ArrayList<>();
        for(Integer x:list){
            copy.add(x);
        }
        return copy;
    }

    void helperFunction(int k,int n,List<Integer> list,int currentSum,int limit){
        if(k!=0) {
            for(int i=limit;i<10;i++) {
                if(currentSum+i < n){
                    list.add(i);
                    helperFunction(k-1,n,list,currentSum+i,i+1);
                    list.remove(list.size()-1);
                }else if(currentSum+i == n){
                    if(k==1){
                        list.add(i);
                        mainList.add(clone(list));
                        list.remove(list.size()-1);
                    }
                }
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        helperFunction(k,n,list,0,1);
        return mainList;
    }
}

public class combination_sum_3 {
    public static void main(String[] args) {
        Solution_combination_sum_3 sol = new Solution_combination_sum_3();
        List<List<Integer>> list = sol.combinationSum3(3,9);
        for(List<Integer> inList:list){
            for(Integer x:inList){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
