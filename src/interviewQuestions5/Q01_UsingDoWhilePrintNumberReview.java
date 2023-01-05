package interviewQuestions5;

public class Q01_UsingDoWhilePrintNumberReview {
    /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.print(n + "   ");
            n += 5;
        } while (n < 100);
    }
}
