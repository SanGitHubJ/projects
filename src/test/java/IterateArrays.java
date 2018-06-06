import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sanath on 5/14/2018.
 */
public class IterateArrays {

    @Test
    public void iterate() {

//        ArrayList itr = new ArrayList();
//
//        itr.add("test");
//        itr.add("fun");
//        itr.add("nice");
//
//        int myList = itr.size();
////For loop
//        for (int i = 0; i < myList; i++) {
//
//            System.out.println("The value is from for loop is" + itr.get(i));
//        }
//
//        // enhance for loop
//
//        for(Object abc:itr){
//
//            System.out.println("The vale is from enhance for loop is : "+abc);
//        }
//
//        //iteretor
//        Iterator itra = itr.iterator();
//
//       while (itra.hasNext())
//       {
//           Object value = itra.next(); //aumatically increment
//
//           System.out.println("Itertor value is: "+value);
//
//       }

        ArrayList array = new ArrayList();
        array.add(1);
        array.add(3);
        array.add(6);
        array.add(3);
        array.add(1);
        array.add(2);

        int ary = array.size();

        int k = 5;
        for(int i=0; i<ary;i++){
          if(array.get(i).equals("k")){
                System.out.println("niestt");
                System.out.println(array.get(i));
                //return array.get(i);
              //  break;
            }
        }


    }
//
//    @Test
//    //public int solution(int[] A) {
//    public void solution(int[] A) {
//        // write your code in Java SE 8
//
//        ArrayList array = new ArrayList();
//        array.add(1);
//        array.add(3);
//        array.add(6);
//        array.add(3);
//        array.add(1);
//        array.add(2);
//
//        int ary = array.size();
//
//        int k = 5;
//        for(int i=0; i<ary;i++){
//            if(array.get(i).equals(5)){
//                System.out.println(array.get(i));
//                //return array.get(i);
//                break;
//            }
//        }
//
//    }
//

    }

