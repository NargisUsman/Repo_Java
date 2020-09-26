package Class1;

import java.util.Arrays;

public class ThirdHomework {
    public static void main(String[] args) {

        // in-class task 9/24/2020
        String statement = "Find the last word statement";
        String subFrom19 = statement.substring(19);
        int statementLength = subFrom19.length();
        System.out.println("The length of the last word is - " + statementLength);

        //Homework #1
        String myFullName = "Nargis Usmanova";
        String firstNameSub = myFullName.substring(0,6);
        int firstNameLen = firstNameSub.length();
        System.out.println(firstNameLen);

        myFullName = "Nargis Usmanova";
        char charAtIndex0 = myFullName.charAt(7);
        System.out.println("My last name starts with letter - " + charAtIndex0);

        boolean lastNameStarts = myFullName.contains("K");
        System.out.println("Does my last name starts with 'K'? " + lastNameStarts);

        char charAtIndex = myFullName.charAt(5);
        System.out.println("Last letter of my first name is - " + charAtIndex);

        boolean lastNameEnds = myFullName.contains("M");
        System.out.println("Does my first name ends with 'M'? - " + lastNameEnds);

        // #2
        String myStatement = "I am a good programmer";
        String[] splitMyStatement = myStatement.split(" ");
        int totalNumberWords = splitMyStatement.length;
        System.out.println(totalNumberWords);

        myStatement = myStatement.replace('r', 'f');
        System.out.println(myStatement);


        // #3
        String firstName = "Nargis";
        String[] splitFirstName = firstName.split("");
        int lengthOfFirstN =splitFirstName.length;
        System.out.println(lengthOfFirstN);

        // #4
        String strNew = "Hello dear, how are you?";
        int strNewLength = strNew.length();
        System.out.println(strNewLength);

        int helloDear = 24;
        boolean correctLength = helloDear>10?true:false;
        System.out.println("The length of the '" + strNew + "' is 24 - " + correctLength);

        // #5
        String threeWordSentence = "hApPY nEW yeAr";
        System.out.println(threeWordSentence);

        String threeWordAllUpperCase = threeWordSentence.toUpperCase();
        threeWordSentence = threeWordSentence.toUpperCase();
        System.out.println(threeWordSentence);

        // #6
        String threeWordsSentences = "Lab sessIONS clAsses";
        String threeWordsSentenceReplace = threeWordsSentences.replace("Lab sessIONS clAsses" ,"LSC");
        System.out.println(threeWordsSentenceReplace);

    }
}
