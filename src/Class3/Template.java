package Class3;

public class Template {

    public double addNumbers(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public boolean primeOrNot(int num) {
        boolean isItPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isItPrime = false;
            }
            break;
        }
        System.out.println(isItPrime);
        return isItPrime;
    }

    public boolean ifItsPalindrome(String str) {
        boolean result = true;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        return result;
    }

    public void findDuplicate(String[] words, String duplicate) {
        duplicate = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(duplicate)) {
                duplicate = words[i];
                break;
            }
        }
        System.out.println(duplicate);
    }

    public void commonValues(String[] value1, String[] value2) {
        String commValue = "";
        for (int i = 0; i < value1.length; i++) {
            for (int j = 0; j < value2.length; j++) {
                if (value1[i] == (value2[j])) {
                    System.out.println(value1[i]);
                    break;
                }
            }
        }



    }
}



















