package interviewQuestions4;

public class Q03_HackerLanguageReview {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java ile hersey guzel");

        for (int i = 1; i <= sb.length(); i++) {
            if (sb.substring(i-1,i).equalsIgnoreCase("a")){
                sb.setCharAt(i-1,'4');
            }if (sb.substring(i-1,i).equalsIgnoreCase("e")){
                sb.setCharAt(i-1,'3');
            }if (sb.substring(i-1,i).equalsIgnoreCase("i")){
                sb.setCharAt(i-1,'1');
            }if (sb.substring(i-1,i).equalsIgnoreCase("o")){
                sb.setCharAt(i-1,'0');
            }if (sb.substring(i-1,i).equalsIgnoreCase("s")){
                sb.setCharAt(i-1,'5');
            }


        }
        System.out.println(sb);



    }

}
