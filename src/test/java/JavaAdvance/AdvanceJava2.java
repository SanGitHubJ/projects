package JavaAdvance;

import java.util.*;

public class AdvanceJava2 {

    public static void main(String args[]){

            String stuff[] = {"jaunk","pascc","bun"};

                converArrayToList(stuff);

                sortArrayByAlphabatic(stuff);

                Character[] bay = {'r','a','o'};
                copyArrary(bay);


                Integer t[] = {1,2,3,4,5,9};


                //findSqureNumber(t);





    }

    public static void converArrayToList(String list[]){

        LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(list)); //Array stuff covert to LIST

        list1.add("pumpking");
        list1.addFirst("firsthing");

        list = list1.toArray(new String[list1.size()]); //LIST onver back to Array

        for (String t : list)
            System.out.println(t+" ");

    }

    public static void sortArrayByAlphabatic(String sort[]){


        List<String> li1 = Arrays.asList(sort);  //covert Array to LIST

        Collections.sort(li1); //to sort array by alphabatic order

        System.out.printf("%s\n",li1);

        Collections.sort(li1,Collections.reverseOrder()); //print array from river order

        System.out.printf("%s\n",li1);

    }

    public static void copyArrary(Character ray[]){

        List<Character> l1 = Arrays.asList(ray);
        System.out.println("List is: ");

        outPut(l1);



        Collections.reverse(l1);
        System.out.println("After reverse: ");

        outPut(l1);

        Character[] newRay = new Character[4];

        List<Character> listCopy = Arrays.asList(newRay);

        //to copy items in L1 arrary to new array listcopy
        Collections.copy(listCopy,l1);

        System.out.println("After copy: ");

        outPut(listCopy);

        //to fill l1 array by X

        Collections.fill(l1, 'X');

        System.out.println("After filll:  ");

        outPut(l1);

    }

    public static void outPut(List<Character> thelist){

        for(Character w : thelist)

            System.out.printf("%s ",w);
        System.out.println();
    }

//    public static void findSqureNumber(Integer ar[]){
//
//        int num = 0;
//
//        List<Integer> lisq = new ArrayList<>();
//
//        Iterator<Integer> it = ar.iterator();
//
//        for(Integer x : ar){
//            lisq.add(x);
//
//            num = (x*x);
//
//        while(it.hasNext()){
//            if(num.(it.next()))
//                System.out.println(num);
//        }
//        }

    }

