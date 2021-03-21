package Class2;

import java.lang.reflect.Array;
import java.util.*;

public class PractiseTwo {
    public static void main(String[] args) {

        String nName = "Nargis";
        boolean resLt = true;
        int mun = 10;
        if (nName.length() > 10 && mun > 5) {
            System.out.println(nName.toUpperCase());
            System.out.println(nName.replace("Nargis", "Faridun"));
        } else {
            resLt = false;
        }
        System.out.println(resLt);


        String fName = "Faridun";
        boolean outcm = false;
        int num = 50;
        if (fName.length() > 6 || num < 45) {
            System.out.println(fName.toLowerCase().replace("faridun", "Nargis"));
        } else {
            outcm = true;
        }
        System.out.println(outcm);

        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int numR : numbers) {
            System.out.println(numR);
        }

        char[] letters = {'n', 'a', 'r', 'g', 'i', 's'};
        for (char name : letters) {
            System.out.println(name);
        }

        ArrayList<String> newArr = new ArrayList();
        newArr.add("Nargis");
        newArr.add("Faridun");
        newArr.add("Idris");
        newArr.add("Azfeer");
        newArr.add("Happy");
        newArr.remove("Happy");
        System.out.println(newArr);
        System.out.println(newArr.get(1));
        System.out.println(newArr.size());
        newArr.isEmpty();

        Map<Integer,String> data = new HashMap<>();
        data.put(101, "Nargis");
        data.put(102, "Faridun");
        data.put(103, "Idris");
        data.put(104, "Azfeer");

        Set<Integer> keys = data.keySet();
        List<Integer> keySet = new ArrayList<>(keys);
        System.out.println(keySet.get(0) + " -> " + data.get(101));
        System.out.println(keySet.get(1) + " -> " + data.get(102));
        System.out.println(keySet.get(2) + " -> " + data.get(103));
        System.out.println(keySet.get(3) + " -> " + data.get(104));

        //My static methods
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        System.out.println(reverse(1234));
        System.out.println(reverseStr("Nargis"));
        System.out.println(reverseStr2("Faridun Nargis"));
        System.out.println(newString("heLLo BeauTiful wOrld"));

        double[] arr = {10.2, 34.5, 56.6, 10.6};
        System.out.println(addArr(arr));

        System.out.println(isPrime(21));
        System.out.println(isPalindrome("racecar"));

        //String words = "narGis, FariduN, AzfEEr, iDris, nargIs";
        //System.out.println(duplicateStr("narGis, FariduN, AzfEEr, iDris, nargIs"));

    }

    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        for (int i=0; i<nums.length-1; i++){
            for(int k=i+1; k<nums.length; k++) {
                if(target == nums[i]+nums[k]) {
                    resultArray[0]=i;
                    resultArray[1]=k;
                }
            }
        }
        return resultArray;
    }

    //Reverse the int
    public static int reverse(int num) {
        int reverse = 0;

        while(num!=0) {
            int digit = num%10;
            reverse = reverse*10+digit;
            num/=10;
        }
        return reverse;

        /*
           - also using for loop:
        *   for(;num != 0; num /= 10) {
               int digit = num % 10;
               reversed = reversed * 10 + digit;
            }
         */
    }

    // Reverse the String
    public static String reverseStr(String str) {
        String[] split = str.split("");
        String reversedWord = "";

        for(int i=str.length()-1; i>=0; i--) {
            reversedWord+= split[i];
            // another way: reversedWord+= str.charAt(i);
        }
        return reversedWord;

        /*
         another way of solving this
         for(int i=0; i<=split.length-1; i++)
            reversedWord = split[i] + reversedWord;
         */
    }

    // Reverse the String using while loop
    public static String reverseStr2(String str) {
        String[] split = str.split("");
        String reversedWord = "";

        int i=0;
        while(i<=split.length-1) {
            reversedWord = split[i] + reversedWord;
            i++;
        }
        return reversedWord;
    }

    //Given String, return first letter of each word in upper case
    public static String newString(String str) {
        String [] splitStr = str.toUpperCase().split(" ");
        String newStr = "";

        for(int i=0; i<=splitStr.length-1; i++) {
            newStr += splitStr[i].substring(0,1) + splitStr[i].substring(1).toLowerCase() + " ";
            //newStr += words + " ";
        }
        return newStr;
    }

    //Create a method to add all numbers in array with double values
    public static double addArr(double[] arr) {
        double total = 0;
        for(double newArr: arr) {
            total+=newArr;
        }
        return total;
    }

    // Verify if given number is prime
    public static boolean isPrime(int num) {
        boolean outPut = false;
        if(num%2!=0) {
            outPut= true;
        }
        return outPut;
    }

    //verify if the given string is palindrome
    public static boolean isPalindrome(String str) {
        String reverse = "";
        boolean result = false;

        for(int i=str.length()-1 ; i>=0; i--) {
            reverse+= str.charAt(i);
            if(reverse.equals(str)) {
                result = true;
            }
        }
        return result;
    }

    // print the duplicate, if there is duplicate found in given String
    public static String duplicateStr(String str) {
        String[] newString = str.split(",");
        String duplicate = "";
        for(int i=0; i<=newString.length-2; i++) {
            if(newString[i].equalsIgnoreCase(newString[i+1])) {
                System.out.println(newString[i]);
                duplicate = newString[i];
            }
        }
        return duplicate;
    }

    // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        int result = 0;
        if(a!=b){
            result = a+b;
        } else {
            result = (a+b)*2;
        }
        return result;
    }

    // Given a string, return a new string where "not " has been added to the front
    public String notString(String str) {
        String newStr = "not";
        if(str.length()>=3 && str.substring(0,3).equals(newStr)) {
            return str;
        }
        return newStr + " " + str;
    }

    //Given a string, if the string "del" appears starting at index 1, return a string where
    // that "del" has been deleted.Otherwise, return the string unchanged.
    public String delDel(String str) {
        String newStr ="";
        if(str.length()>=3 && str.substring(1,4).equals("del")) {
            str.split(str.substring(1,4));              // return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    // Given three int values, a b c, return the largest.
    public int intMax(int a, int b, int c) {
        if(a>b && a>c) {
            return a;
        } else if(b>a && b>c) {
            return b;
        }
        return c;
    }

    //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    // or return 0 if neither is in that range.
    public int max1020(int a, int b) {
        if(a>0 && b>0) {
            if(a>=10 && a<=20) {
                return a;
            } else if(b>=10 && b<=20) {
                return b;
            }
        }
        return 0;
    }

    public boolean makes10(int a, int b) {
        boolean result = false;
        if((a==10 || b==10) || (a+b==10)) {
            result = true;
        }
        return result;
    }










}
