import java.util.Scanner;

public class bitonic_sequence {

    static int findBitonicPoint(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            int mid = (first+last)/2;
            if(mid == arr.length-1 || mid == 0){
                return mid;
            }
            if(arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }

    static int increasingSearch(int[] arr,int first,int last,int key){
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }

    static int decreasingSearch(int[] arr,int first,int last,int key){
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]>key){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int index = findBitonicPoint(arr);
        int increaseAns = increasingSearch(arr,0,index,key);
        if(increaseAns == -1){
            System.out.println(decreasingSearch(arr,index,n-1,key));
        }else {
            System.out.println(increaseAns);
        }
    }
}
