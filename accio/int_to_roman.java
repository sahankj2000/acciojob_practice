import java.util.Scanner;

public class int_to_roman {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      sc.close();
      String ans = "";
      int[] arr = new int[4];
      int index = 0;
      while(num!=0){
        arr[index] = num%10;
        num = num/10;
        index++;
      }
      if(arr[3]!=0){
        for(int i=0;i<arr[3];i++){
          ans += "M";
        }
      }
      if(arr[2]!=0){
        if(arr[2]<=3){
          for(int i=0;i<arr[2];i++){
            ans += "C";
          }
        }else if(arr[2] == 4){
          ans += "CD";
        }else if(arr[2] == 5){
          ans += "D";
        }else if(arr[2] <= 8){
          ans += "D";
          for(int i=0;i<(-5+arr[2]);i++){
            ans += "C";
          }
        }else{
          ans += "CM";
        }
      }
      if(arr[1]!=0){
        if(arr[1]<=3){
          for(int i=0;i<arr[1];i++){
            ans += "X";
          }
        }else if(arr[1] == 4){
          ans += "XL";
        }else if(arr[1] == 5){
          ans += "L";
        }else if(arr[1] <= 8){
          ans += "L";
          for(int i=0;i<(-5+arr[1]);i++){
            ans += "X";
          }
        }else{
          ans += "XC";
        }
      }
      if(arr[0]!=0){
        if(arr[0]<=3){
          for(int i=0;i<arr[0];i++){
            ans += "I";
          }
        }else if(arr[0] == 4){
          ans += "IV";
        }else if(arr[0] == 5){
          ans += "V";
        }else if(arr[0] <= 8){
          ans += "V";
          for(int i=0;i<(-5+arr[0]);i++){
            ans += "I";
          }
        }else{
          ans += "IX";
        }
      }
      System.out.println(ans);
	}
}
