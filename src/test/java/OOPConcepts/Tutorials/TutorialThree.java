package OOPConcepts.Tutorials;

import java.util.*;

public class TutorialThree {

    public static void main(String args[]){

        checkHasMap();
        hasSet();
        collection();


    }

    public static void checkHasMap(){

        Map<String,String> mp = new Hashtable<>();
        mp.put("nike","89");
        mp.put("rbk","67");
        mp.put("dass","56");

        Set<String> s = mp.keySet();
        for (String a : s)
            System.out.println(a+"::"+mp.get(a));
    }

    public static void hasSet(){

        Set<String> sd = new TreeSet<>(); // TreeSet will automatically sort the value but HasSet is randon gen values
        sd.add("89");
        sd.add("62");
        sd.add("67");

        for (String d : sd)
            System.out.println("hasSet are:"+d);

    }

    public static void collection(){

        Collection cl = new ArrayList<>();

        cl.add("89");
        cl.add("67");
        cl.add("13");

        //Collections.sort(cl);

        for (Object v : cl)
            System.out.println("Collectio list is:"+v);


        List<String> a = new ArrayList<>();

        a.add("89");
        a.add("67");
        a.add("13");
        Collections.sort(a);
        Collections.reverse(a);
        for (String b : a)
            System.out.println("list atfer sort:"+b); //
    }
}
