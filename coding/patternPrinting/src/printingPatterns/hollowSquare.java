package printingPatterns;

public class hollowSquare {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            boolean flag = (i == 0 || i == 4-1) ? true : false;
            for (int j = 0; j < 4; j++) {
                if(flag){
                    System.out.print("*");
                } else{
                    if(j == 0 || j == 4-1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

//for (int i = 1; i <=row; i++) {
//        for (int j = 1; j <= col; j++)
//        if((i==1 || i==col) || (j==1 || j==col))
//        System.out.print("*");
//				else
//                        System.out.print(" ");
//
//			System.out.println();
//
//		}
//                }
