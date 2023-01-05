package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02Review {

      /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wrd = "";

        do{
            System.out.println("giris");
            wrd = scan.next();

            if(wrd.length()%2==1 && wrd.length()>2) {
                System.out.println(wrd.substring(wrd.length()/2,wrd.length()/2+1));
            }



        }while (wrd.length()%2==1 && wrd.length()>2);
        System.out.println("You entered wrong word.");


    }
}
