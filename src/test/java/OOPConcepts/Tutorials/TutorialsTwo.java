package OOPConcepts.Tutorials;

import java.util.*;

public class TutorialsTwo {

    public static void main(String args[]){

        TestJava ts = new TestJava();
        System.out.println(ts.TestPrint(4,5,6));

        ts.prarseData();
        ts.Collection();
        ts.hasMap();




    }
}


class TestJava{

    public int TestPrint(int ...n){  //n is variable length arguments:: 3 dot represent multiple parameters in case need to send more or less does not matter

        System.out.println("to check two class::>");
        int sum=0;
        for(int i : n) {

            sum += i;
        }
        return sum;


    }

    public  void  prarseData (){


        String x = "121";
        System.out.println(x+9);

        int j = Integer.parseInt(x);
        System.err.println(j+9);
    }

    public void Collection(){

        Collection value = new ArrayList(); //collection doen not support Index number insted can use Iterator

        value.add(8);
        value.add(9);
        value.add(6);
        System.out.println(Collections.max(value));
        //((ArrayList) value).add(2,5);

        Iterator it = value.iterator();
        while (it.hasNext()){

           // if (value.contains(6))

                System.out.println(it.next());
                //break;
        }
        System.out.println(value.size());


        List val = new ArrayList(); // List suport for Index, which can use to add number by Index
        val.add(402);
        val.add(187);
        val.add(0,691); // here 0 is index and 6 will add to 0 index
        Collections.sort(val); // this will sort the list of elements in LIST val, in assending order
        Collections.reverse(val); // atter SORT revers will make in disending order
        System.out.println("max val in list::"+Collections.max(val));
        System.out.println("min val in list::"+Collections.min(val));
        //val.remove(1);

        for (Object b : val) {
            System.out.println(b);
            System.out.println(val.get(0));
        }

        List<Integer> val1 = new ArrayList(); // List suport for Index, which can use to add number by Index
        val1.add(4709);
        val1.add(1872);
        val1.add(6976);

//        Comparator<Integer> c = new Comparator<Integer>() { //  to sort array by last digit since this is LAMDA expression we can write as below
//           // @Override
//            public int compare(Integer i, Integer j) {
//                if (i%10>j%10)
//                    return 1;  // one mean swap element
//                else
//                return -1; //
//            }
//        };
        //Comparator<Integer> c= (i,j) -> i%10>j%10?1:-1;  //this is LABDA expresion for Anonimus class, we can optimize to below for LAMDA ex..
        Collections.sort(val1,(i,j) ->i%10>j%10?1:-1);
        for (Integer q : val1){

            System.out.println("short by last digits::"+q);

        }


    }

    public void hasMap(){

        Map<String,String> map = new HashMap<>();

        map.put("jon","56");
        map.put("cena","45");
        map.put("jack","68");

        Set<String> lt = map.keySet();

        for (String tr : lt){
            System.out.println(tr + "::"+map.get(tr));
            System.out.println(map);
        }
    }
}
