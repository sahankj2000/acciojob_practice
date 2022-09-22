import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combination_sum_2 {

    static ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();

    static boolean isin(ArrayList<Integer> list){
        for(ArrayList<Integer> inList:arrayLists){
            if(list.size() == inList.size()){
                boolean equals = true;
                for(int i=0;i<list.size();i++){
                    if(list.get(i)!=inList.get(i)){
                        equals = false;
                        break;
                    }
                }
                if(equals){
                    return true;
                }
            }
        }
        return false;
    }

    static void helperFunction(int[] arr, int limit, int target, ArrayList<Integer> list,int curSum){
        for(int i=limit;i<arr.length;i++){
            if(curSum+arr[i]<target){
                curSum += arr[i];
                list.add(arr[i]);
                helperFunction(arr,i+1,target,list,curSum);
                list.remove(list.size()-1);
                curSum -= arr[i];
            } else if (curSum+arr[i] == target) {
                list.add(arr[i]);
                if(!isin(list)){
                    arrayLists.add((ArrayList<Integer>) list.clone());
                }
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        helperFunction(arr,0,target,list,0);
        for(ArrayList<Integer> inList:arrayLists){
            for(Integer x:inList){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
