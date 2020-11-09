package Homework10;

import java.sql.SQLOutput;
import java.util.*;

public class MyMain {
    public static void main(String[] args)  {

        //In class exercise print the keys with values 101->Happy
        Map<Integer, String> ssnData = new HashMap<>();
        ssnData.put(101,"Happy");
        ssnData.put(102,"Very Happy");
        ssnData.put(1000,"Peace");
        ssnData.put(989,"Stay Healthy");

        Set<Integer> keySet= ssnData.keySet();
        List<Integer> keysSet = new ArrayList<>(keySet);
        System.out.println(keysSet.get(0) + " -> " + ssnData.get(101));
        System.out.println(keysSet.get(1) + " -> " + ssnData.get(102));
        System.out.println(keysSet.get(2) + " -> " + ssnData.get(1000));
        System.out.println(keysSet.get(3) + " -> " + ssnData.get(989));


        List<String> words = new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("joy");
        words.add("laugh");
        words.add("happy");
        words.add("laugh");
        words.add("joy");
        MyMain.duplicateValue(words);


        Map<Integer, String> keys = new HashMap<>();
        keys.put(101,"happy");
        keys.put(102,"peace");
        keys.put(103,"Happy");
        keys.put(104,"learn");
        keys.put(105,"PEaCe");
        keys.put(106,"HAPPY");
        System.out.println(keys);

        MyMain.keysWithSameValues();

        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */
    }
    public static Map<String, Integer> duplicateValue(List<String> words) {

        Map<String, Integer> mapWords = new HashMap<>();
        int count =0;
        for(int i=0; i<words.size(); i++) {
            for(int j=1; i<words.size(); i++)
                if (words.get(i).equals(words.get(j))) {
                    count++;
                    mapWords.put(words.get(j), count);
                    System.out.println(mapWords);
                    break;
                }
        }
        return mapWords;

        //Set<String> s = new HashSet<>();
        //for(String list: words){
            //if(s.add(list)==false){
                //System.out.println(list);
            //}
        //}
        //return list;
        // I have to figure out why List variable giving me error.

    }
          /**
           *
           * Question 2:
           * Create a hashMap with any numbers of key-value pairs from the user
           * Key should be Integer
           * Value should be String
           *
           * Create method that will print the keys with same value, else "All keys have different values"
           * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
           * Output (print) ->
           *      "happy" with keys -> 101, 103, 106
           *      "peace" with keys -> 102, 105
           *
           * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
           * Output (print) ->
           *      All keys have different values
           */

    public static void keysWithSameValues () {
        Map<Integer, String> keys = new HashMap<>();
        Set<Integer> mapKeys = keys.keySet();
        List<Integer> mmapKeys = new ArrayList(mapKeys);
        System.out.println(mmapKeys);
        Collection<String> newValue=keys.values();
        List<String> afterNewValue = new ArrayList<>(newValue);
        for(Map.Entry mKeys : keys.entrySet()) {
            if(mKeys.getKey().equals(afterNewValue.toString().toLowerCase())) {
                System.out.println(mKeys.getKey() + " - " + afterNewValue);
            }
            System.out.println(mKeys.getKey() + " - " + afterNewValue);
        }



        /*Set<Integer> mapKeys = keys.keySet();
        List<Integer> mmapKeys = new ArrayList<>(mapKeys);
        System.out.println(mmapKeys);
        Collection<String> newValue=keys.values();
        List<String> afterNewValue = new ArrayList<>(newValue);
        String toLowerCase = newValue.toString().toLowerCase();
        System.out.println(toLowerCase);
        System.out.println(keys);
        for(int i=0; i<keys.size(); i++) {
            if (keys.get(0).equals(toLowerCase)) {
                System.out.println(toLowerCase + " - " + mmapKeys);

            }

        }
        System.out.println(afterNewValue + " - " + mmapKeys);

         */

    }



}
