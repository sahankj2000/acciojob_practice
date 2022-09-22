public class quick_sort {

    static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void quickSort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int pivot = start;
        int high = end;
        int low = start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=arr[pivot]){
                if(i<=high){
                    low = i;
                }else{
                    swap(arr,high,i);
                    low = high;
                    high = low+1;
                }
            }else{
                if(i<=high){
                    high = i;
                }
            }
        }
        swap(arr,low,pivot);
        if(low != start){
            quickSort(arr,start,low-1);
        }
        if(low!=end){
            quickSort(arr,low+1,end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,100};
        quickSort(arr,0,9);
        printArray(arr);
    }
}
