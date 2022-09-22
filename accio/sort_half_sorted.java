import java.util.Scanner;

public class sort_half_sorted {

    static int[] customSort(int[] arr,int mid){
        // 2 3 8 -1 7 10
        int l = arr.length;
        int[] ans = new int[l];
        int i = 0;
        int j = mid;
        int index = 0;
        while(i<mid&&j<l){
            if(arr[i]<=arr[j]){
                ans[index] = arr[i];
                i++;
            }else{
                ans[index] = arr[j];
                j++;
            }
            index++;
        }
        while(i<mid){
            ans[index] = arr[i];
            i++;
            index++;
        }
        while(j<l){
            ans[index] = arr[j];
            j++;
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }

      int mid = n/2;
      if(arr[mid]>arr[mid-1]){
          mid = (n/2)+1;
      }

      int[] ans = customSort(arr, mid);

      for(int x:ans){
        System.out.print(x);
        System.out.print(" ");  
      }
      sc.close();
    }
}

