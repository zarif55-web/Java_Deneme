package interviewQuestions7;

import java.util.Scanner;

public class Q01_UseContinueReview {

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String ifade = scan.nextLine();
        String arr[]= ifade.replace(" ", "").replace("a", "").split("");
        for (String w : arr){
            System.out.println(w);
        }


    }


}
