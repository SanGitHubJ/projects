import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sanath on 5/14/2018.
 */
public class IterateArrays {

    @Test
    public void iterate() {

        ArrayList itr = new ArrayList();

        itr.add("test");
        itr.add("fun");
        itr.add("nice");

        int myList = itr.size();
//For loop
        for (int i = 0; i < myList; i++) {

            System.out.println("The value is from for loop is" + itr.get(i));
        }

        // enhance for loop

        for(Object abc:itr){

            System.out.println("The vale is from enhance for loop is : "+abc);
        }

        //iteretor
        Iterator itra = itr.iterator();

       while (itra.hasNext())
       {
           Object value = itra.next(); //aumatically increment

           System.out.println("Itertor value is: "+value);

       }


    }

    }

