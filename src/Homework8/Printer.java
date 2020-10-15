package Homework8;

public class Printer {

    private int ink=0;
    private int pages=0;
    private int totalInk=100;
    private int totalPages=100;

    public void addInk(int inkAmount) {
        if(inkAmount>totalInk) {
            System.out.println("Ink amount is low, please add more ink.");
        }
    }

    public void addPages(int page) {
       if(page>totalPages) {
           System.out.println("Please add more paper");
       }

    }

    public void printSingle(int page, int ink) {
       totalInk-=ink;
       totalPages-=page;
        System.out.println(totalInk);
        System.out.println(totalPages);


    }

    public void printDouble(int page, int ink) {
        totalInk-=ink;
        totalPages-=(page/2);
        System.out.println(totalInk);
        System.out.println(totalPages);

    }

    public void printSummery() {
        System.out.println("Total summery of ink: " + totalInk);
        System.out.println("Total of pages: " + totalPages);

    }

    public void checkToner() {
        if(ink<10) {
            System.out.println("Warning: 'Add toner'");
        } else {
            System.out.println("Printing");
        }
    }
}
