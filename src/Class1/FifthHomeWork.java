package Class1;

public class FifthHomeWork {
    public static void main(String[] args) {

        //in class exercise, reverse the string
        String word = "happy";
        String revWord = "";
        for(int a=word.length()-1; a>=0; a--) {
            revWord+=word.charAt(a);                // also can use substring method - word.substring(a, a+1)
        }
        System.out.println(revWord);

        //#1 Write code/method to return abbreviation for any given string
        String msg = "Outfit of the day";
        System.out.println(msg);
        String[] abr = msg.split(" ");
        String abbreviation = "";
        for(int i=0; i<=abr.length-1; i++) {
            abbreviation+=abr[i].substring(0,1).toUpperCase();
        }
        System.out.println("Abbreviation " + abbreviation);
        


        for(String titleCase: abr) {
            System.out.println(titleCase);
        }

        String msg2 = "have a great day to you";
        System.out.println(msg2);

        String[] abr2 = msg2.split(" ");
        String abbreviation2 = "";
        for(int d=0; d<=abr2.length-1;  d++) {
            abbreviation2+=abr2[d].substring(0,1).toUpperCase();
        }
        System.out.println("Abbreviation :" + abbreviation2);


        for(String titleC: abr2) {
            System.out.println(titleC);
        }


        String msg3 = "have happy and prosperous life";
        System.out.println(msg3);
        String[] abr3 = msg3.toUpperCase().split(" ");
        abbreviation2 = "";
        for(int e=0;e<=abr3.length-1;  e++) {
            abbreviation2+=abr3[e].substring(0,1);
        }
        System.out.println("Abbreviation :" + abbreviation2);

        for(String abbrV: abr3) {
            System.out.println(abbrV);
        }


        //#2 Change the string to title case
        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println(line);

        String[] str = line.toLowerCase().split(" ");
        for(int b=0; b<str.length; b++) {
            str[b]= str[b].substring(0,1).toUpperCase()+str[b].substring(1);
            System.out.println(str[b]);
        }

        for(String title: str) {           //enhanced loop
            System.out.println(title);
        }

        //#3 Reverse the string
        String message = "happy holidays";
        String reverseMessage = "";
        System.out.println("Message :" + message);

        int j=0;
        while(j<message.length()) {
            reverseMessage = message.substring(j, j+1) +  reverseMessage;
            j++;
        }
        System.out.println("Message in reverse :" + reverseMessage);








    }
}


