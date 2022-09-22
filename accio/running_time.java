import java.util.Scanner;

public class running_time {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

      int k = 0;
      while(true){
        boolean flag = true;
        for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
            flag = false;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            k++;
            break;
          }
        }
        if(flag){
          break;
        }
      }
      System.out.println(k);
	}
}
