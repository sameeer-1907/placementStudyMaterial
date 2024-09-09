package printingPatterns;

public class diamondStar {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                if(j >=Math.abs((n/2+1)-i) && j<n-(Math.abs((n/2+1)-i))){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
