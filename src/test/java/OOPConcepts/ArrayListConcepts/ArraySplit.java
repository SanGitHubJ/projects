package OOPConcepts.ArrayListConcepts;

import java.util.StringTokenizer;

public class ArraySplit {

    public static void main(String [] args){

       ArraySplit test = new ArraySplit();

             test.split();

         }

    public void split() {

        String arr = "this is to test.is?my!first split";

        String array[] = arr.split("[.?!]");

        for (int i = 0; i < array.length; i++) {

            //System.out.println(array[i]);
            //System.out.println(array.length);
            StringTokenizer nt = new StringTokenizer(array[i]);

            //System.out.println(nt.countTokens());

            int max = nt.countTokens();

            System.out.println(max);


        }
    }
}
