package printingPatterns;

public class halfDiamondOrArrow {
    public static void main(String[] args) {
        int n = 7;
        String s= "";
        for(int i=0; i<=n/2; i++){
            s = s + "*";
        }
        int till = 1;
        for(int i=1; i<=n; i++){
            System.out.println(s.substring(0,till));
            if(i >= (n/2)+1){
                till--;
            }else{
                till++;
            }
        }
    }
}
