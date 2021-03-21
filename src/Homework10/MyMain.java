package Homework10;

import java.sql.SQLOutput;
import java.util.*;

public class MyMain {
    public static void main(String[] args)  {

        //In class exercise print the keys with values 101 -> Happy
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

    }

    /**
     * Given a map of food keys and topping values, modify and return the map as follows:
     * if the key "potato" has a value, set that as the value for the key "fries"
     * If the key "salad" has a value, set that as the value for the key "spinach"
     */
    public Map<String, String> topping3(Map<String, String> map) {

        if(map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if(map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
     * If both keys are present, append their 2 string values together and store the result under the key "ab".
     */
    public static Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a")+map.get("b"));
        } else if(map.containsKey("a")) {
            map.put("a",map.get("a"));
        } else if(map.containsKey("b")) {
            map.put("b", map.get("b"));
        }
        return map;
    }

    /**
     * Given a map of food keys and their topping values, modify and return the map as follows:
     * if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
     * If the key "spinach" has a value, change that value to "nuts".
     */
    public static Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if(map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
     * In all cases remove the key "c", leaving the rest of the map unchanged.
     */
    public static Map<String, String> mapShare(Map<String, String> map) {

        map.remove("c");

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the keys "a" and "b" are both
     * in the map and have equal values, remove them both.
     */
    public static Map<String, String> equalValue(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    /**
     * Given a map of food keys and topping values, modify and return the map as follows:
     * if the key "ice cream" is present, set its value to "cherry".
     * In all cases, set the key "bread" to have the value "butter".
     */
    public static Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");

        if(map.containsKey("ice cream")) {
            map.put("ice cream","cherry");
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the value "".
     */
    public static Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /**
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     */
    public static Map<String, Integer> duplicateValue(List<String> words) {

        Map<String, Integer> mapWords = new HashMap<>();
        int count = 0;
        for(int i=0; i<words.size()-1; i++) {
            for (int j=i+1; j<words.size(); j++) {
                if (words.get(j).equals(words.get(i))) {
                    count++;
                    mapWords.put(words.get(j), count);
                    break;
                }
            }
        }
        System.out.println(mapWords);
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
            } else {
                System.out.println("All keys have different values");
            }

        }

    }


}
