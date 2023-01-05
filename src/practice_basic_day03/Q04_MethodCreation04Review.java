package practice_basic_day03;

public class Q04_MethodCreation04Review {
    /*
     * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
     * toplamini dondursun.
     *
     * Ornek
     * input : ade1r4d3
     * output : 8
     *
     * Ipucu:
     *     Character.isDigit()
     *     Integer.valueOf()
     */
		/*
            Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */
    public static void main(String[] args) {

        String grs = "ade1r4d3";
        System.out.println(sayiBulTopla(grs));


    }

    private static int sayiBulTopla(String grs) {
String strD= grs.replaceAll("\\D","");
int sonuc=0;
        System.out.println(strD);
        for (int i = 0; i < strD.length(); i++) {
            sonuc+= Integer.valueOf(strD.substring(i,i+1));



        }
return sonuc;


    }
}
