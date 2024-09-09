package printingPatterns;

import java.util.Scanner;

public class pyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int start = n-i;
            int end = n+n-1-start;
            for(int j=0; j<n+n-1; j++){
                if(j>=start && j<end){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
