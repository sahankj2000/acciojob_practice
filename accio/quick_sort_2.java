import java.util.Arrays;

public class quick_sort_2 {

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArray(int[] arr,int first,int last){
        for(int i=first;i<=last;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int[] arr,int first,int last){
        if(first < last){
            int l = first - last;
            int[] left = new int[l];
            int[] right = new int[l];
            int lindex = 0;
            int rindex = 0;
            for(int i=first+1;i<=last;i++){
                if(arr[i]<arr[first]){
                    left[lindex] = arr[i];
                    lindex++;
                }else{
                    right[rindex] = arr[i];
                    rindex++;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,3,7,9,2};
        quickSort(arr,0,arr.length-1);
    }
}
