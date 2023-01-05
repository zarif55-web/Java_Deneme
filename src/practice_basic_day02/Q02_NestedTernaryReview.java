package practice_basic_day02;

public class Q02_NestedTernaryReview {
    public static void main(String[] args) {

        /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        String finalNotu = "D";

       String result = finalNotu == "A" ? "Gayet Basarili": (finalNotu == "B")? "basarili": (finalNotu == "C") ? "Ha gayret" : "Digerleri";
        System.out.println(result);



    }
}
