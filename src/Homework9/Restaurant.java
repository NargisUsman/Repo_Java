package Homework9;

public class Restaurant {

    private String resName= "Cafe Nargis";
    private int guestCapacity = 60;
    private static int guestCount= 25;
    private static int availSeats =35;

    public Restaurant(String resName, int guestCapacity) {
        System.out.println("The Restaurant" +" '"+ resName +"'"+" is open");
        System.out.println("The capacity of our Restaurant is " + guestCapacity);



    }

    public int availableSeats() {
        if(guestCount<guestCapacity&&guestCount<availSeats) {
            availSeats=guestCapacity-guestCount;
        }
        System.out.println("There are " + availSeats + " available seats right now.");
        return availSeats;


    }

    public int  seatsParty (int newGuest) {
        if(newGuest<=availSeats&&guestCount<guestCapacity) {
            guestCount+=newGuest;
            availSeats=guestCapacity-guestCount;
        }
        System.out.println("Your table for " + newGuest + " is ready, follow me please.");
        System.out.println("There are " + availSeats + " available seats");
        return availSeats;

    }

    public int removeParty () {
        int leavingGuest = 10;
        guestCount-=leavingGuest;
        availSeats=guestCapacity-guestCount;
        System.out.println(leavingGuest + " people leaving now, in total " + availSeats + " seats will open up.");
        return availSeats;




    }

    public void restaurantSummary () {
        System.out.println("'" + resName + "'");
        System.out.println("Current guest count of the restaurant is " + guestCount);
        System.out.println("The capacity of the restaurant is " + guestCapacity);

    }





}
