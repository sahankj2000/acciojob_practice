import java.util.Scanner;

public class time_conversion {

    static int[] customSplit(String time){
        int[] arr = new int[4];
        String[] strarr = time.split(":");
        arr[0] = Integer.parseInt(strarr[0]);
        arr[1] = Integer.parseInt(strarr[1]);
        arr[2] = Integer.parseInt(new String(strarr[2].substring(0,2)));
        if(strarr[2].charAt(2) == 'A'){
            arr[3] = 0;
        }else{
            arr[3] = 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time12 = sc.nextLine();
        int arr[] = customSplit(time12);

        int hour;
        if(arr[3]==0) {
            hour = arr[0] % 12;
        }else{
            hour = 12 + (arr[0] % 12);
        }
        if(hour<10){
            System.out.print("0"+hour+":");
        }else {
            System.out.print(hour+":");
        }
        if(arr[1]<10){
            System.out.print("0"+arr[1]+":");
        }else{
            System.out.print(arr[1]+":");
        }
        if(arr[2]<10){
            System.out.println("0"+arr[2]);
        }else{
            System.out.println(arr[2]);
        }
    }
}
