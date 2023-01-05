package practice_basic_day04;

import java.util.*;

public class Q11_ArraysListReview {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isim");
        String str = scan.nextLine().toLowerCase(Locale.ROOT);
        str.trim();
        str = str.replaceAll(" ","");

        List <String> aktifKulanıcılar = new ArrayList(Arrays.asList("ali","veli","hasan","can","kan"));

        boolean kullanabilirMi= false;
        for ( String w : aktifKulanıcılar) {

            if (w.equals(str)) {
                kullanabilirMi=false;
                System.out.println("seçtiginiz isim önceden kayıtlıdır. ");
                break;

            }else {
                kullanabilirMi =true;

            }
        }
        if (kullanabilirMi) {
            aktifKulanıcılar.add(str);
            System.out.println("sisteme  " + str+" ismiyle kaydoldunuz");
        }else {
            int rasgeleSayi = new Random().nextInt(100000);

            String strR = str + rasgeleSayi;
            aktifKulanıcılar.add(strR);
            System.out.println("sisteme  " + strR+" ismiyle kaydoldunuz");
        }
        System.out.println(aktifKulanıcılar);









    }
}
