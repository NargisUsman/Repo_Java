package testHomework;

public class TestQuestions {

    public  int[] afterRemoving(int[] input, int remove) {
        int[] userInput = input;
        int toremove = remove;
        for(int i=0; i<userInput.length; i++) {
            if(userInput[i]==toremove) {
                userInput[i]=userInput[0+1];
            } else {
                System.out.println(userInput[i]);
            }
        }
        return userInput;
    }

    public static int missingSmallestInteger(int[] input, int number){
        int[] inputValue = input;
        int missingNumber = number;
        for(int i=0; i<inputValue.length; i++) {
            if(inputValue[i]!=missingNumber) {
                System.out.println(missingNumber);
                break;
            }
        }
        return missingNumber;
    }

    // Ahsan's code
    public static int missingNum(int[] arr){
        int missingInt = 1; //2, 3
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==missingInt){
                missingInt++;
                i = -1;
            }
        }
        return missingInt;
    }

    public void pointsChargedAgainstSpeeding() {
        int speed = 70;
        switch(speed) {
            case 74:
                System.out.println("0 points");
                break;
            case 78:
                System.out.println("1 points");
                break;
            case 88:
                System.out.println("3 point");
                break;
            case 178:
                System.out.println("21 points - Your License is suspended.");
                break;
            default:
                System.out.println("Thank you for driving within the speed limit.");
                break;
        }

    }
}
