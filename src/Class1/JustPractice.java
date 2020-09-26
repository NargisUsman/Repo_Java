package Class1;

public class JustPractice {

    public static void main(String[] args) {

        int abc =15;
        int def = abc;
        System.out.println("DEF = " + def);

        int num1 = 15;
        double  num2 = 5.5;
        double result = num1/num2;
        System.out.println("Result is " + result);
        int ver = 15;
        ver++;
        ++ver;
        System.out.println(ver++);
        System.out.println(++ver);

        int age =7;
        System.out.println(age); // 7
        System.out.println(age++); //7
        System.out.println(age); //8
        System.out.println(++age); //9
        System.out.println(age); //9
        System.out.println(age--); //9
        System.out.println(age); //8
        System.out.println(--age); //7
        System.out.println(age); //7


        int num10 = 15;
        int num20 = 17;
        boolean abcd = ++num1 == --num2;
        System.out.println(num1 + " == " + num2 + " = " + abc);

        int time = 19;
        time++;
        System.out.println(" time is " + time++);
        System.out.println("time is " + time);
        System.out.println("time is " + ++time);

        String helloWorld = "Hello World";
        String helloWorld1 = " Hi";
        System.out.println(helloWorld + helloWorld1);

        int narG =30, narG1 = 40, narG2 = 50, narG3 = 10;
        boolean narGisEqual = narG1 - narG == narG2 - narG1;
        System.out.println(narG1 + " - " + narG + " and " + narG3 + " - " + narG2 + " is equal " + narGisEqual);

        narGisEqual = narG1 != narG && narG2 >=narG3;
        System.out.println(narG1 + " not equal to " + narG + " and " + narG2 + " > " + narG3 + " is " + narGisEqual);

        narGisEqual = narG2 >= narG1 || (narG3 + narG) >= narG2;
        System.out.println( "50>40 and (10+30) is greater than 50 "+ narGisEqual);

        int num = 25;
        boolean isEven = true;

        int remainder = num%5;
        isEven = remainder == 0;
        System.out.println("Is " + num + " an even number - " + isEven);
    }


}
