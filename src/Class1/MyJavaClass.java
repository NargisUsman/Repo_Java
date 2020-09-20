package Class1;

   public class MyJavaClass {

       public static void main(String[] args) {

           byte hoursInDay = 24; // byte range fits better
            System.out.println("Numbers of hours in a day is " + hoursInDay);

            short daysInAYear = 365;
             System.out.println("There are " + daysInAYear + " days in a year.");

             int numberOfEmployees = 1500;
             System.out.println("Total number of Employees in this organization is " + numberOfEmployees);

             long countryPopulation = 382000L;
             System.out.println("The population of this country is " + countryPopulation);

             float interestRate = 2.96f;
             System.out.println("Interest rate is " + interestRate);

             double accBalance =23000;
             System.out.println("The balance in a bank account is " + accBalance);

             accBalance = 22150; // balance is changed
             System.out.println("The account balance is " + accBalance);

             boolean isSunRise = false;
             System.out.println("Does the sun rises from the west? " + isSunRise);

             char initialOfFirstN ='N';
             char initialOfLastN = 'U';
             System.out.println("Initials of my name is " + initialOfFirstN + initialOfLastN);

             String fullName = "Nargis Usman";
             System.out.println("My full name is " + fullName);

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




       }
}
