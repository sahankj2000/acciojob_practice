import java.util.Scanner;

public class red_knight {

    static boolean isA(int i,int j){
        if(i % 2 == 0){
            if(i % 4 == 0){
                if(j % 2 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                if(j % 2 == 0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isB(int i,int j){
        if(i % 2 == 0){
            if(i % 4 == 0){
                if(j % 2 == 0){
                    return false;
                }else{
                    return true;
                }
            }else{
                if(j % 2 == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    static boolean isC(int i,int j){
        if(i % 2 != 0){
            if((i+1) % 4 == 0){
                if(j % 2 != 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                if(j % 2 != 0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isD(int i,int j){
        if(i % 2 != 0){
            if((i+1) % 4 == 0){
                if(j % 2 != 0){
                    return false;
                }else{
                    return true;
                }
            }else{
                if(j % 2 != 0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    static boolean isReachable(int start_i,int start_j,int end_i,int end_j){
        if(isA(start_i,start_j) && isA(end_i,end_j)){
            return true;
        }
        if(isB(start_i,start_j) && isB(end_i,end_j)){
            return true;
        }
        if(isC(start_i,start_j) && isC(end_i,end_j)){
            return true;
        }
        if(isD(start_i,start_j) && isD(end_i,end_j)){
            return true;
        }
        return false;
    }

    static boolean properCords(int n,int start_i,int start_j,int end_i,int end_j){
        if(start_i < 0 || start_i >= n){
            return false;
        }
        if(start_j < 0 || start_j >= n){
            return false;
        }
        if(end_i < 0 || end_i >= n){
            return false;
        }
        if(end_j < 0 || end_j >= n){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start_i = sc.nextInt();
        int start_j = sc.nextInt();
        int end_i = sc.nextInt();
        int end_j = sc.nextInt();

        if(isReachable(start_i,start_j,end_i,end_j) && properCords(n,start_i,start_j,end_i,end_j)){
            int count = 0;
            String[] arr = new String[n];
            while(true){
                if((start_i == end_i) && (start_j == end_j)){ // reached end position
                    System.out.println(count);
                    break;
                }
                if(start_i > end_i){ // upper
                    start_i -= 2;
                    if(start_j >= end_j){ // left
                        start_j--;
                        arr[count] = "UL";
                    }else{ // right
                        start_j++;
                        arr[count] = "UR";
                    }
                }else if(start_i < end_i){ // lower
                    start_i += 2;
                    if(start_j <= end_j){ // right
                        start_j++;
                        arr[count] = "LR";
                    }else{
                        start_j--;
                        arr[count] = "LL";
                    }
                }else{ // same leve
                    if(start_j <= end_j){ // right
                        start_j += 2;
                        arr[count] = "R";
                    }else { // left
                        start_j -= 2;
                        arr[count] = "L";
                    }
                }
                count++;
            }
            for(int i=0;i<count;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println("Impossible");
        }
    }
}
