package Class1;

   public class MyJavaClass {

       public static void main(String[] args) {

           byte hoursInDay = 24; // byte range fits better
            System.out.println("Numbers of hours in a day is " + hoursInDay);

            short daysInAYear = 365;
             System.out.println("There are " + daysInAYear + " days in a year.");

             int numberOfEmployees = 1500;
             System.out.println("Total number of Employees in this organization is " + numberOfEmployees);

             long countryPopulation = 382000;
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

       }
}
