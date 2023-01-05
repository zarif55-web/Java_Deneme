package interviewQuestions6;

public class Q01_FrequencyOfGivenCharactersReviewer {
    /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    static String output = "";

    public static void main(String[] args) {

        String str = "AAABBCD";

        frekans(str);
        // int counter =1;
    }

    private static void frekans(String str) {
        int counter = 1;
        for (int i = 0; i < str.length() ; i++) {
            counter = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    counter++;

                }


            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += str.substring(i, i + 1) + counter;

            }


        }
        System.out.print(output);


    }


}
