package printingPatterns;

public class rhombus {
    public static void main(String[] args) {
        int k = 0;
        for(int i=0; i<4; i++){
            for(int s=0; s<k; s++){
                System.out.print(" ");
            }
            k++;
            for(int j=0; j<4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
