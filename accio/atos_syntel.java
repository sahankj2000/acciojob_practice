public class atos_syntel {
    public static void main(String[] args) {
        String str = "ATOS-SYNTEL";
        int i = 0;
        while (i<str.length()){
            int spaces = str.length()-i;
            while (spaces!=0){ // place first spaces
                System.out.print(" ");
                spaces--;
            }
            int j = -1;
            while (j!=i){ // printing characters
                System.out.print(str.charAt(++j)+" ");
            }
            System.out.println();
            i++;
        }
        i=0;
        while (i<str.length()){ // same loop as above but replace with space in middle
            int spaces = str.length()-i;
            while (spaces!=0){
                System.out.print(" ");
                spaces--;
            }
            int j = -1;
            while (j!=i){
                if(j==i-1 || j == -1 || i == str.length()-1) {
                    System.out.print(str.charAt(j+1) + " ");
                }else{
                    System.out.print("  "); // two spaces
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
