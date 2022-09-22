import java.util.Scanner;

public class flip_bits {

    static int flip(int[] arr,int first,int last){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int bit = arr[i];
            if(i <= last && i >= first){
                bit = 1-bit;
            }
            if(bit == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1};
        int n = arr.length;
        int maxCount = 0;
        for(int x:arr){
            if(x == 1){
                maxCount++;
            }
        }
        int first = 0;
        int last = 0;
        int zcount = 0;
        int ocount = 0;
        int maxGain = 0;
        while (last<n){
            while (zcount>=ocount && last<n){
                if(arr[last] == 1){
                    ocount++;
                }else{
                    zcount++;
                }
                last++;
                int gain = zcount - ocount;
                if(gain>maxGain){
                    maxGain = gain;
                }
            }
            while (first<last){
                if(arr[first] == 1){
                    ocount--;
                }else{
                    zcount--;
                }
                int gain = zcount - ocount;
                if(gain>maxGain){
                    maxGain = gain;
                }
                first++;
            }
        }
        System.out.println(maxCount+maxGain);
    }
}
