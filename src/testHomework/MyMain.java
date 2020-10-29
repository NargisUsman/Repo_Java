package testHomework;

public class MyMain {
    public static void main(String[] args) {

        TestQuestions t1 = new TestQuestions();
        int[] userInput = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int toRemove = 24;
        t1.afterRemoving(userInput,toRemove);

        int[] inputValue = {1, 3, 5, 4, 2, 7};
        int missingNumber = 6;
        TestQuestions.missingSmallestInteger(inputValue,missingNumber);

        int[] myArr = {5,6,7,8,9,10};
        int missingInt = 1;


        t1.pointsChargedAgainstSpeeding();
    }
}
