package testHomework;

public class MyMain {
    public static void main(String[] args) {

        TestQuestions t1 = new TestQuestions();
        int[] input = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int toRemove = 24;
        System.out.println(t1.afterRemoving(input,toRemove));

        int[] inputValue = {1, 3, 5, 4, 2, 7};
        int missingNumber = 6;
        TestQuestions.missingSmallestInteger(inputValue,missingNumber);

        t1.pointsChargedAgainstSpeeding();
    }
}
