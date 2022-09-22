import java.util.ArrayList;
import java.util.List;

class Solution_restore_ip_addresses {
    List<String> list = new ArrayList<>();

    void helperFunction(String main,int index,String current,int level){
        if(level != 4) {
            for (int i = index + 1; i <= index + 3; i++) {
                if(i<=main.length()){
                    String str = main.substring(index,i);
                    if(str!="" && str.length()<4) {
                        if(str.length()>1){
                            if(str.charAt(0)!='0'){
                                int val = Integer.parseInt(str);
                                if (val <= 255) {
                                    helperFunction(main, i, current + str + ".", level + 1);
                                }
                            }
                        }else {
                            int val = Integer.parseInt(str);
                            if (val <= 255) {
                                helperFunction(main, i, current + str + ".", level + 1);
                            }
                        }
                    }
                }
            }
        }else{
            String str = main.substring(index,main.length());
            if(str!="" && str.length()<4){
                if(str.length()>1){
                    if(str.charAt(0)!='0'){
                        int val = Integer.parseInt(str);
                        if (val <= 255) {
                            list.add(current + str);
                        }
                    }
                }else {
                    int val = Integer.parseInt(str);
                    if (val <= 255) {
                        list.add(current + str);
                    }
                }
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        helperFunction(s,0,"",1);
        return list;
    }
}

public class restore_ip_addresses {
    public static void main(String[] args) {
        Solution_restore_ip_addresses sol = new Solution_restore_ip_addresses();
        for(String str:sol.restoreIpAddresses("0279245587303")){
            System.out.println(str);
        }
    }
}
