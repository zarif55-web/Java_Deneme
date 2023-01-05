package interviewQuestions7;

public class Q05_Printing2DArrayReview {

    // Print 2D String array using loops

    public static void main(String[] args) {
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }

        }

        }
}
