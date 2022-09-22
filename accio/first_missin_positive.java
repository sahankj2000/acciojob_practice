public class first_missin_positive {

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int send_negatives_first(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while (true){
            while (first < arr.length && arr[first] <= 0) {
                first++;
            }
            while (last>=0 && arr[last]>0){
                last--;
            }
            if(first<last) {
                swap(arr, first, last);
            }else{
                break;
            }
        }
        return last+1;
    }

    static void index_ways_marker(int[] arr,int start){  // marks the elements of index x as -ve if x is in arr
        for(int i=start;i<arr.length;i++){
            int index = Math.abs(arr[i]);
            if(index < arr.length-start+1){
                index = index+start-1;
                if(arr[index]>0) {
                    arr[index] = arr[index] - (arr[index] * 2);
                }
            }
        }
    }

    static int firstMissingPositive(int[] arr){
        int start = send_negatives_first(arr);
        index_ways_marker(arr,start);
        int i=0;
        for(i=start;i<arr.length;i++){
            if(arr[i]>0){
                return (i+1)-start;
            }
        }
        return (i+1)-start;
    }

    static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0,2,2,1,1};
        System.out.println(firstMissingPositive(arr));
    }
}
