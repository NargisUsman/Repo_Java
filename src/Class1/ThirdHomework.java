package Class1;

import java.util.Arrays;

public class ThirdHomework {
    public static void main(String[] args) {

        // in-class task 9/24/2020
        String statement1 = "Find my name in the note";
        int findName = statement1.lastIndexOf(" ");
        String lastWord = statement1.substring(findName+1);
        int lastWordlength = lastWord.length();
        System.out.println(lastWordlength);

        String word = "I live in Flushing, NY";
        int lastWordIndex = word.lastIndexOf(" ");
        String lastWord1 = word.substring(lastWordIndex+1);
        int lastWordLen = lastWord1.length();
        System.out.println(lastWordLen);



        //Homework #1
        String myFullName = "Nargis Usmanova";
        String[] name = myFullName.split(" ");
        String firstName = name[0];
        String lastName = name[1];
        System.out.println("the length of my first name is- " + firstName.length());

        boolean isStartsWith = lastName.toUpperCase().startsWith("K");
        System.out.println("Does my lastname starts with 'K' " + isStartsWith);

        int firstNameIndex = firstName.length()-1;
        char charAt = firstName.charAt(firstNameIndex);
        System.out.println("Last letter of the firstname  '" + firstName + "' is - " + charAt);

        boolean isEndsWith = lastName.toUpperCase().endsWith("M");
        System.out.println("Does lastname '" + lastName + "' ends with 'M " + isEndsWith);



        // #2
        String myStatement = "I am a good programmer";
        String[] splitMyStatement = myStatement.split(" ");
        int totalNumberWords = splitMyStatement.length;
        System.out.println(totalNumberWords);

        myStatement = myStatement.replace('r', 'f');
        System.out.println(myStatement);


        // #3
        String firsName = "Nargis";
        String[] splitFirstName = firstName.split("");
        int lengthOfFirstN = splitFirstName.length;
        System.out.println(lengthOfFirstN);

        // #4
        String strNew = "Hello dear, how are you?";
        int strNewLength = strNew.length();
        System.out.println(strNewLength);

        boolean correctLength = strNewLength>10?true:false;
        System.out.println("The length of the '" + strNew + "' is 24 - " + correctLength);

        // #5
        String threeWordSentence = "hApPY nEW yeAr";
        System.out.println(threeWordSentence);

        String[] splitWords = threeWordSentence.toLowerCase().split(" ");
        String hWord = splitWords[0].substring(0,1).toUpperCase();
        String hPWord = splitWords[0].substring(1);
        splitWords[0] = hWord + hPWord;

        String nWord = splitWords[1].substring(0,1).toUpperCase();
        String nNWord = splitWords[1].substring(1);
        splitWords[1] = nWord + nNWord;

        String yWord = splitWords[2].substring(0,1).toUpperCase();
        String yYWord = splitWords[2].substring(1);
        splitWords[2] = yWord + yYWord;
        threeWordSentence = splitWords[0] + " "  + splitWords[1] + " "  + splitWords[2];
        System.out.println(threeWordSentence);



        // #6
        String createAbbr = "Lab sessIONS clAsses";
        String[] splitBySpace = createAbbr.toUpperCase().split(" ");
        String a = splitBySpace[0].replace("LAB","L");
        String b = splitBySpace[1].replace("SESSIONS","S");
        String c = splitBySpace[2].replace("CLASSES","C");
        System.out.println(a + b + c);







    }
}
