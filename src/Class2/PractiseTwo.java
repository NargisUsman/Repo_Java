package Class2;

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
    }
    //Math Library practise

    public int addTwo(int num1, int num2) {
        return num1 + num2;

    }

    public int subTwo(int num1, int num2) {
        return num1 - num2;

    }

    public int multiplyTwo(int num1, int num2) {
        return num1 * num2;

    }

    public int divideTwo(int num1, int num2) {
        return num1 / num2;

    }


}
