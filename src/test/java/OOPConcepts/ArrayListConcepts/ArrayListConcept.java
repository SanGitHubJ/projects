package OOPConcepts.ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args){

        ArrayList array = new ArrayList(); // value store as per INDEX basis starting 0,1,2 etc..
        //for this array can store any data type bvx NO Data type define

        array.add(200); //index 0
        array.add(300); //index 1
        array.add(400);

        System.out.println(array.size());

        array.add(500);
        array.add(600);
        System.out.println(array.size());

        array.add("Tom");
        array.add(333.44);
        System.out.println(array.size());

        System.out.println(array.get(4));

        for(int i=0; i<array.size();i++){

            System.out.println(array.get(i));

            ArrayList<String> arr = new ArrayList<String>();

            arr.add("mich");
            arr.add("tom");
            System.out.println(arr.get(0));
            System.out.println(arr.get(1));


        }
    }
}
