package practice_basic_day02;

public class Q09_StringManipulation03Review {

    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        String str2 = "$10.55";
        double dStr1 = Double.parseDouble(str1.substring(1));
        double dStr2 = Double.parseDouble(str2.substring(1));


        //double dStr1 = Double.parseDouble(str1.replaceAll("\\D","")); //saçmalığn daniskası
        //double dStr2 = Double.parseDouble(str2.replaceAll("\\D","")); // /100 hard code yazıyor


        double toplam = dStr1+dStr2;
        System.out.println(toplam);


    }
}
