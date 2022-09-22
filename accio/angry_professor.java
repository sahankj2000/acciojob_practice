import java.util.Scanner;

public class angry_professor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean[] ans = new boolean[t];
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arrived = 0;
            for(int j=0;j<n;j++){
                if(sc.nextInt()<=0){
                    arrived++;
                }
            }
            if(arrived>=k){
                ans[i] = false;
            }else{
                ans[i] = true;
            }
        }

        for(boolean x:ans){
            if(x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}