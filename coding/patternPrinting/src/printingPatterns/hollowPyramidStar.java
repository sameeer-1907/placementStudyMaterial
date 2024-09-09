package printingPatterns;

import java.util.Scanner;

public class hollowPyramidStar {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n+n-1; j++){
                if(j == n-i || j == n+n-1-(n-i)|| i==n){
                    System.out.print("*");
                    if(i == 1){
                        break;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
