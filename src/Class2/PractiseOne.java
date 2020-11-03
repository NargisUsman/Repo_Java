package Class2;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class PractiseOne {
    public static void main(String[] args) {

        String name = "Happy";
        boolean result = true;
        int num = 22;
        if(name.length()>3&&num>5) {                                       //if length of name greater than 10 and num is greater than 5
            System.out.println(name.toUpperCase());                         // print in Upper case
            System.out.println(name.replace('p','b'));       // replace 'p' with 'b'
        } else {                                                            // else make result as false
            result=false;
        }
        System.out.println(result);                                         // print result

        //print"Even if the number is even
        int numb =10;
        if(numb%2==0) {
            System.out.println("Even");
        }


        //if count is greater than 10 or city length greater than 5 print and replace, else print outcome
        String city = "Chicago";
        boolean outcome = true;
        int count = 5;
        if(count>10||city.length()>5) {
            System.out.println("Chicago");
            System.out.println(city.replace("Chicago","LA"));
        } else {
            outcome = false;
        }
        System.out.println(outcome);

        //in class exercise
        String fanName = "Darya";
        switch (fanName) {
            case "Darya":
            case "Nargis":
            case "Ash":
            case "Sidker":
            case "Dmitri":
                System.out.println(fanName + " is fan of Football");
                break;
            case "Rasel":
            case "Maryna":
                System.out.println(fanName + " is fan of Basketball");
                break;
            case "Alex":
                System.out.println(fanName + "is fan of something else");
                break;
            default:
                System.out.println(fanName + "  none of the above");
                break;
        }

        String fName = "Maryna";
        if(fName.equals("Endri")||fName.equals("Nargis")||fName.equals("Dmitri")||fName.equals("Ash")) {
            System.out.println(fName + " is fan of Football");
        } else if(fName.equals("Maryna")||fName.equals("Sidker")) {
            System.out.println(fName + " is fan of Basketball");
        } else if(fName.equals("Alex")) {
            System.out.println(fName + " is not a fan of Football or Basketball");
        } else {
            System.out.println("None of the above");
        }

        //(class 11in) class exercise
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        for(int numR: numbers){
            System.out.println(numR);
        }

        for(int b=10; b>=1; b--) {
            System.out.println(b);    // for this type of code use for loop, because it looks better, than creating Enhanced loop
        }

        for(int numBr: numbers){       //enhanced loop
            System.out.println(numBr);
        }

        for(int c=1; c<=10; c++) {
            System.out.println(c);
        }

        char[] alphabets = {'A','B','C','D','E','F','G'};
        for(char abc: alphabets) {
            System.out.println(abc);
        }
        for(int f=0; f<alphabets.length-1; f++) {
            System.out.println(alphabets[f]);
        }
        int j=0;
        while(j<alphabets.length) {
            System.out.println(alphabets[j]);
            j++;
        }

        int[] numbeRs = {1,2,3,4,5,6,7,8,9,10};
        for (int i=1 ; i<=numbers.length ; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        for(int numb2: numbeRs) {
            if(numb2%2==0) {
                System.out.println(numb2);
            }
        }

        double[] arr ={10.5, 1.5, 2.5, 8.5};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        String fname = "Nargis";
        String lname = "Usmanova";
        System.out.println("Hello \n" + fname +" "+ lname);

        int number = 50;
        int number2 = 3;
        int total = number+number2;
        System.out.println(total);

        total = number/number2;
        System.out.println(total);

        int w = -5 + 8 * 6;
        int x = (55 + 9) % 9;
        int y = 20 + (-3 * 5 / 8);
        int z = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(w+"\n"+x+"\n"+y+"\n"+z+"\n");

        int a = 25;
        int b = 5;
        System.out.println(a+"*"+b+"="+a*b);

        int ab = 125;
        int bc = 24;
        System.out.println(ab+"%"+bc+"="+ab%bc);

        //Takes the number as input and prints its multiplication table.
        int de=8;
        for(int i=0; i<10; i++) {
            System.out.println(de + "*"+(i+1)+"="+(de*(i+1)));
        }

        double r =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(r);

        //Calculate the 3 input numbers to print the average of the numbers.
        System.out.println((a*b*ab)/3);

        String nameW= "Nargis";
        String nameE="Usmanova";
        nameW=nameE;
        nameE=nameW;
        System.out.println(nameW+"\n"+nameE);

        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");
        /*Print the key-value as shows below:
        101 -> Happy
        102 -> Very Happy
        1000 -> Peace
        9898 -> stay healthy
         */




        /*public static boolean ifContains(List<Integer> myList) {
            HashSet<Integer> mySet = new HashSet<Integer>(myList);
            boolean result;
            if( mySet.size()==myList.size()) {
                result=true;
            } else {
                result=false;
            }
            return result;
        }

         */











    }

}
