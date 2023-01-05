package interviewQuestions5;

public class Q04_RpintVowelsOfString {

    //vowels ları yazalım.

    public static void main(String[] args) {

        String strCumle = "Java çok kolayi";
        String vowels = "aeiou";
        String yazVowels = "";

        for (int i = 0; i < strCumle.length(); i++) {
            String a = strCumle.substring(i, i + 1).toLowerCase();
            if (vowels.contains(a)) {
                if (!yazVowels.contains(a)) {
                    yazVowels += a;
                }
            }
        }
        System.out.println(yazVowels);
    }
}
