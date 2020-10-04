package Class2;

public class PractiseOne {
    public static void main(String[] args) {

        String name = "Happy";
        boolean result = true;
        int num = 22;
        if(name.length()>10&&num>5) {                                       //if length of name greater than 10 and num is greater than 5
            System.out.println(name.toUpperCase());                         // print in Upper case
            System.out.println(name.replace('p','b'));       // replace 'p' with 'b'
        } else {                                                            // else make result as false
            result=false;
        }
        System.out.println(result);                                         // print result

        //print"Even if the number is even
        int numb =10;
        if(numb%2==0) {
            System.out.println("Even");
        }

        //if count is greater than 10 or city length greater than 5 print and replace, else print outcome
        String city = "Chicago";
        boolean outcome = false;
        int count = 5;
        if(count>10||city.length()>5) {
            System.out.println("Chicago");
            System.out.println(city.replace("Chicago","LA"));
        } else {
            outcome = true;
        }
        System.out.println(outcome);

        //in class exercise
        String fanName = "Darya";
        switch (fanName) {
            case "Darya":
            case "Nargis":
            case "Ash":
            case "Sidker":
            case "Dmitri":
                System.out.println(fanName + " is fan of Football");
                break;
            case "Rasel":
            case "Maryna":
                System.out.println(fanName + " is fan of Basketball");
                break;
            case "Alex":
                System.out.println(fanName + "is fan of something else");
                break;
            default:
                System.out.println(fanName + "  none of the above");
                break;
        }

        String fName = "Maryna";
        if(fName.equals("Endri")||fName.equals("Nargis")||fName.equals("Dmitri")||fName.equals("Ash")) {
            System.out.println(fName + " is fan of Football");
        } else if(fName.equals("Maryna")||fName.equals("Sidker")) {
            System.out.println(fName + " is fan of Basketball");
        } else if(fName.equals("Alex")) {
            System.out.println(fName + " is not a fan of Football and Basketball");
        } else {
            System.out.println("None of the above");
        }

        //class 11in call exercise
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        for(int numR: numbers){
            System.out.println(numR);
        }

        for(int b=10; b<=1; b--) {
            System.out.println(b); // for this type of code use for loop, because it looks better, than creating Enhanced loop
        }
        for(int c=1; c<=10; c++) {
            System.out.println(c);
        }
        char[] alphabets = {'A','B','C','D','E','F','G'};
        for(char abc: alphabets) {
            System.out.println(abc);
        }
        for(int f=0; f<alphabets.length-1; f++) {
            System.out.println(alphabets[f]);
        }
        int j=0;
        while(j<alphabets.length) {
            System.out.println(alphabets[j]);
            j++;
        }




    }

}
