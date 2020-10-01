package Class1;

import java.util.Arrays;

public class FirstHomeWork {
        public static void main(String[] args) {

                int abc = 15;
                int def = abc;
                System.out.println("DEF = " + def);

                int num1 = 15;
                double num2 = 5.5;
                double result = num1 / num2;
                System.out.println("Result is " + result);
                int ver = 15;
                ver++;
                ++ver;
                System.out.println(ver++);
                System.out.println(++ver);

                int age = 7;
                System.out.println(age); // 7
                System.out.println(age++); //7
                System.out.println(age); //8
                System.out.println(++age); //9
                System.out.println(age); //9
                System.out.println(age--); //9
                System.out.println(age); //8
                System.out.println(--age); //7
                System.out.println(age); //7


                int num10 = 15;
                int num20 = 17;
                boolean abcd = ++num1 == --num2;
                System.out.println(num1 + " == " + num2 + " = " + abc);

                int time = 19;
                time++;
                System.out.println(" time is " + time++);
                System.out.println("time is " + time);
                System.out.println("time is " + ++time);

                String helloWorld = "Hello World";
                String helloWorld1 = " Hi";
                System.out.println(helloWorld + helloWorld1);

                int narG = 30, narG1 = 40, narG2 = 50, narG3 = 10;
                boolean narGisEqual = narG1 - narG == narG2 - narG1;
                System.out.println(narG1 + " - " + narG + " and " + narG3 + " - " + narG2 + " is equal " + narGisEqual);

                narGisEqual = narG1 != narG && narG2 >= narG3;
                System.out.println(narG1 + " not equal to " + narG + " and " + narG2 + " > " + narG3 + " is " + narGisEqual);

                narGisEqual = narG2 >= narG1 || (narG3 + narG) >= narG2;
                System.out.println("50>40 and (10+30) is greater than 50 " + narGisEqual);

                int num = 25;
                boolean isEven = true;

                int remainder = num % 5;
                isEven = remainder == 0;
                System.out.println("Is " + num + " an even number - " + isEven);

                String townName = "Flushing Queens, NY";
                townName.toLowerCase();
                System.out.println(townName.toLowerCase());
                System.out.println(townName);

                townName.toUpperCase();
                System.out.println(townName.toUpperCase());

                boolean townNameContains = townName.contains("Queens");
                System.out.println(townNameContains);

                boolean townNameEqual = townName.equals(townName.toUpperCase());
                System.out.println(townNameEqual);

                boolean townNameEqualIgnoreCases = townName.equalsIgnoreCase(townName.toUpperCase());
                System.out.println(townNameEqualIgnoreCases);

                char charAtTownName = townName.charAt(7);
                System.out.println(charAtTownName);

                int lengthTownName = townName.length();
                System.out.println(lengthTownName);

                townName.indexOf('N');
                System.out.println(townName.indexOf('N'));
                int lastIndexOfTownName = townName.lastIndexOf('y');
                System.out.println(lastIndexOfTownName);

                townName.replace('Q', 's');
                System.out.println(townName.replace('Q', 's'));
                townName.replace("Flushing", "Astoria");
                System.out.println(townName.replace("Flushing", "Astoria"));

                String tTownName = "  Astoria Queens, NY  ";
                String trimTownName = tTownName.trim();
                System.out.println(trimTownName);

                String subFrom8 = trimTownName.substring(8);
                System.out.println(subFrom8);
                String subFrom4t11 = trimTownName.substring(4, 11);
                System.out.println(subFrom4t11);

                // ask Ahsan on lab
                String zipCode = "11102";
                String concatTownName = trimTownName.concat(" 11102");
                System.out.println(concatTownName);
                concatTownName.join(" Apt#2 ", zipCode, tTownName);      // Can I enter variable name to join or value?
                System.out.println(String.join(" Apt#2 ", zipCode, tTownName)); //do I need to print the same thing?

                trimTownName.isEmpty();
                System.out.println(trimTownName.isEmpty());

                String[] planets = new String[3];
                int[] counts = new int[3];

                planets[0] = "Earth";
                planets[1] = "Mars";
                planets[2] = "Venus";

                counts[0] = 125;
                counts[1] = 0;
                counts[2] = 0;
                System.out.println(counts.length);

                String[] citys = {"New York", "Chicago", "Miami",};
                System.out.println(Arrays.toString(planets));
                System.out.println(Arrays.toString(citys));

                // How many times word "world appears in this sentence?
                String happyWorld = "Happy world is the world where everybody healthy and full";
                String[] splitHappyWorld = happyWorld.split("world"); //split the "world'
                int numberOfWorldInHappyWorld = splitHappyWorld.length;     // then find the length of the array
                System.out.println(numberOfWorldInHappyWorld);
                int lenNumberOfWorld = numberOfWorldInHappyWorld - 1;         // length-1 is the answer, which is 2 (2"world")
                System.out.println(lenNumberOfWorld);

                int number = 31;
                boolean isNumEven = true;
                int remainderR = number % 5;
                isNumEven = remainderR == 0;
                System.out.println("Is " + number + " even: " + isNumEven);


                String monthName = "December";
                switch (monthName) {
                        case "December, January, February":
                                System.out.println("Winter");
                                break;
                        case "March, April, May":
                                System.out.println("Spring");
                                break;
                        case "June, July, August":
                                System.out.println("Summer");
                                break;
                        case "September, October, November":
                                System.out.println("Fall");
                                break;
                        default:
                                System.out.println("Invalid Month");
                                break;


                }}
        }







