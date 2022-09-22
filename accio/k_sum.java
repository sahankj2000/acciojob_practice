import java.util.Scanner;

public class k_sum {
    static int upperFlooredDivision(int a,int b){ // a/b form
        int ans = a/b;
        if(a%b != 0){
            return ++ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int highest = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr[i] = temp;
            if(temp>highest){
                highest = temp;
            }
        }

        int m = 0;
        for(int i=1;i<highest;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += upperFlooredDivision(arr[j],i);
                if(sum > k)
                    break;
            }
            if(sum<=k && m<i){
                m = i;
                break;
            }
        }
        System.out.println(m);
    }
}
