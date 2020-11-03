package Class1;

public class SixthHomeWork {
    public static void main(String[] args) {
        int[] values = {25, 35, 45, 55};
        double arrayAvg = arrayAvg(values);
        System.out.println(arrayAvg(values));


        String[] names = {"john", "michael", "gphilippre", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        int nameIndex = findNameIndex(names, nameToSearch);
        System.out.println(findNameIndex(names, nameToSearch));


    }

    public static int findNameIndex(String[] names, String nameToSearch) {
        int nameIndex = -1;
        for(int i =0; i<names.length; i++) {
            if(names[i].equalsIgnoreCase(nameToSearch)) {
                nameIndex=i;
                break;
            }
        }
        return nameIndex;



    }

    public static double arrayAvg(int[] arr) {    //if asked NO RETURN than use VOID and just simply print the result out of loop.
        double avg = 0;
        for(int i=0; i<arr.length; i++) {
            avg+=arr[i];
        }
        int sum = arr.length;
        return avg/sum;


    }





}
