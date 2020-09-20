package Class2;

public class MyJavaClass2 {
    public static void main(String[] args) {

        double fTemp = 10;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " F is equal to " + cTemp + " C"); // F -> C

        double fTemp2 = 10;
        double kTemp = (fTemp2 + 459.67) * 5/9;
        System.out.println(fTemp2 + " F is equal to " + kTemp + " K"); // F -> K

        double kTemp2 =10;
        double cTemp2 =kTemp2 - 273.15;
        System.out.println(kTemp2 + " K is equal to " + cTemp2 + " C"); // K -> C

        double kTemp3 = 10;
        double fTemp3 = kTemp3 * 9/5 - 459.67;
        System.out.println(kTemp3 + " K is equal to " + fTemp3 + " F"); // K -> F

        double cTemp3 =10;
        double fTemp4 = cTemp3 * 9/5 + 32;
        System.out.println(cTemp3 + " C is equal to " + fTemp4 + " F"); // C -> F

        double cTemp4 = 10;
        double kTemp4 =cTemp4 + 273.15;
        System.out.println(cTemp4 + " C is equal to " + kTemp4 + " K"); // C -> K
    }
}
