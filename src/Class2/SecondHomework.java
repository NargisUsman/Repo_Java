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






        





    }
}
