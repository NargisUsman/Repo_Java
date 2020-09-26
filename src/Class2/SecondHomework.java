package Class2;

public class SecondHomework {
    public static void main(String[] args) {

        double fTemp = 10;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " C"); // F -> C

        double kTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + " F is equal to " + kTemp + " K"); // F -> K

        kTemp =10;
        cTemp =kTemp - 273.15;
        System.out.println(kTemp + " K is equal to " + cTemp + " C"); // K -> C

        kTemp = 10;
        fTemp = kTemp * 9/5 - 459.67;
        System.out.println(kTemp + " K is equal to " + fTemp + " F"); // K -> F

        cTemp =10;
        fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + " C is equal to " + fTemp + " F"); // C -> F

        cTemp = 10;
        kTemp =cTemp + 273.15;
        System.out.println(cTemp + " C is equal to " + kTemp + " K"); // C -> K


        int num1 = 15;
        int num2 = 17;
        boolean abc = ++num1 == --num2;
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
