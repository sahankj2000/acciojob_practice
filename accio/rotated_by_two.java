public class rotated_by_two {

    static boolean isRotated(String str1,String str2){
        String leftRotated = str1.substring(2,str1.length())+str1.charAt(0)+str1.charAt(1);
        //System.out.println(leftRotated);
        String rightRotated = ""+str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1)+str1.substring(0,str1.length()-2);
        //System.out.println(rightRotated);
        if(leftRotated.compareTo(str2) == 0 || rightRotated.compareTo(str2) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotated("amazon","azonam"));
    }
}
