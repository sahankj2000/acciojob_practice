import java.util.Scanner;

public class line_them_up {
    static boolean isAscending(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])>0){
                return false;
            }
        }
        return true;
    }

    static boolean isDescending(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        if(isAscending(arr)){
            System.out.println("INCREASING");
        } else if (isDescending(arr)) {
            System.out.println("DECREASING");
        }else{
            System.out.println("NEITHER");
        }
    }
}
