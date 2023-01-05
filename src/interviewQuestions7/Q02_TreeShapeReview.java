package interviewQuestions7;

public class Q02_TreeShapeReview {


    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        int tacUzunluk = 6;
        int govdeUzunluk = 6;
        int counter = 0;

        for (int i = 0; i < tacUzunluk; i++) {
            counter++;
            for (int j = 0; j < counter; j++) {
                System.out.print("^");

            }
            System.out.println();

        }
        for (int i = 0; i < govdeUzunluk; i++) {
            System.out.println("|||");

        }

    }
}
