package printingPatterns;

public class triangle {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j > i){
                    break;
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
