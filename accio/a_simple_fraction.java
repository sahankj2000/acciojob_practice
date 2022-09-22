import java.util.*;
import java.lang.*;
import java.io.*;

public class a_simple_fraction{

    static String divide(int a,int b){
      int integer = a / b;
      int remainder = a % b;
      String numbers = "";
      while(true){
        if(remainder == 0){
          if(numbers == ""){
            return Integer.toString(integer);
          }
          else{
              return Integer.toString(integer)+numbers;
          }
        }
        remainder *= 10;
        String rem = Integer.toString((int)remainder/b);
        // if()
        remainder = remainder%b;
      }
    }
  
	public static void main (String[] args) throws java.lang.Exception{
      Scanner sc = new Scanner(System.in);
      int neum = sc.nextInt();
      int deno = sc.nextInt();
      System.out.println(divide(neum,deno));
	}
}
