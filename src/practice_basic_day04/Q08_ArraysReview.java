package practice_basic_day04;

public class Q08_ArraysReview {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {


    String arr [][] =  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
    double toplam =0;

    for ( String w [] : arr){
        for (String m : w){
            if (m.contains("$")){
                toplam += Integer.valueOf(m.replace("$",""))*3.2;

            }else if (m.contains("€")){
                toplam += Integer.valueOf(m.replaceAll("€",""))*4.2;
            }
        }
    }
        System.out.println(toplam);










    }
}
