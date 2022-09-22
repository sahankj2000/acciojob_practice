import java.util.Scanner;

public class diff_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i = n-1;
        int j = i-1;
        boolean possible = false;
        while (i>0 && j>0 && i>j){
            int diff = arr[i]-arr[j];
            if(diff == k){
                possible = true;
                break;
            }
            if(diff<k){
                j--;
            }else if(i-1!=j){
                i--;
            }else{
                j--;
            }
        }
        if(possible){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
