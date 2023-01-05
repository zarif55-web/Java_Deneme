package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06Review {

    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("row");
        int row = scan.nextInt();
        System.out.println("clumn");
        int clm = scan.nextInt();




        for (int i = 0; i <row ; i++) {
            System.out.println();

            for (int j = 0; j < clm; j++) {
                System.out.print("*");

            }

        }
    }
}
