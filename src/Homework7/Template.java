package Class3;

public class Template {
        //Create a method to add all numbers in array with double values.
    public double addNumbers(double[] arr) {
        double sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum;
    }
    //Create a method to verify if the input int number is prime or not
    public boolean primeOrNot(int num) {
        boolean isItPrime = true;
        for (int i=2; i<=num/2; i++) {
            if ((num % i)==0) {
                isItPrime = false;
            }
            break;
        }
        System.out.println(isItPrime);
        return isItPrime;
    }
    //Create a method to find if the given string is palindrome
    public boolean ifItsPalindrome(String str) {
        boolean result = true;
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        if (reverse.equals(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        return result;
    }
    //Write a method to print(NO RETURN) the duplicate values of given String array
    public void findDuplicate(String[] words, String duplicate) {
        duplicate = "";
        for (int i=0; i<words.length; i++) {
            if (words[i].contains(duplicate)) {
                duplicate = words[i];
                break;
            }
        }
        System.out.println(duplicate);
    }
    //Write a method to print (NO RETURN) the common values between 2 String arrays
    public void commonValues(String[] value1, String[] value2) {
        String commValue = "";
        for (int i=0; i<value1.length; i++) {
            for (int j=0; j<value2.length; j++) {
                if (value1[i] == (value2[j])) {
                    System.out.println(value1[i]);
                    commValue=value1[i];
                    break;
                }
            }
            System.out.println(value1[i]);
        }



    }
}



















