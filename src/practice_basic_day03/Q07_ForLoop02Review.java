package practice_basic_day03;

public class Q07_ForLoop02Review {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {

            char a= (char)i;
            System.out.println(a +"----"+ i);

        }
    }
}
