package JavaAdvance;

import java.util.*;

public class AdvanceJava {

    //public long n =4;

    public static void main(String args[]){

        String words[] = {"funk","chunk","furry","babacotor"};

            AdvanceJava tj = new AdvanceJava();

            tj.startEndWith(words);

            String k = "dhjhdjhdkdsdkwwk";
            tj.serachCharactor(k);

        System.out.println("4 factorial value is:"+tj.recursion(4));

        String thing[] = {"bat","cat","nut"};

        String morething[] = {"jazz","bat","juice"};

        tj.collection(thing,morething);

        tj.linkListArray();




    }

    public void startEndWith(String word[]){

        for (String w : word){

            if (w.startsWith("fu")){
                System.out.println("word start with"+ w);
            }else if (w.endsWith("nk")){
                System.out.println(w+"word end with nk");
            }
            else {System.out.println("no word match");}
        }


    }

    public void serachCharactor(String r){


        System.out.println(r.indexOf("dk",9)); // 9 mean ignore the first 9 charactor or can give with 9 ie ("k")

        String a = "baconb";
        String b = "  moNster  ";

        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a.replace("b","f"));
        System.out.println(a.replaceAll("b","d"));
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());

        System.out.println(b.trim());  // trim can use to remove the space


    }

    public long recursion(long n){

        if (n<=1){
            return 1;
           // System.out.println("nnn");
        }else
            return n * recursion(n-1); // getting FACTORIAL MEAN 4 * 3 * 2 *1 = 12
        //return  n* (n-1);
        //1>> 4 * 3!  = 12
        //2>> 3 * 2! = 24
        //3> 1! * 24 = 24
    }

    public void collection(String l1[],String l2[]){

        List<String> list1 = new ArrayList<>();

        for(String q : l1)

            list1.add(q);
//
        for (int i=0;i<list1.size();i++){

            System.out.println("%s " +list1.get(i));
           System.out.println("list1 sixe before remove" + list1.size());
        }
//
        List<String> list2 = new ArrayList<>();
        for(String q1 : l2)

            list2.add(q1);
//
        for (int i=0;i<list2.size();i++){

            System.out.println("%s " +list2.get(i));
           // System.out.println("2"+l2.size());
        }

        editList(list1,list2);

        System.out.println("#######");

        for (int i=0;i<list1.size();i++){

            System.out.print("atfer removed >> " +list1.get(i));
            // System.out.printf("list1 size after remove" + list1.size());
        }

    }

    public void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();

        while (it.hasNext()){
            if (l2.contains(it.next())){
                it.remove();
            }
        }

       // String thing[] = {"bat","cat","nut"};

        //String morething[] = {"jazz","bat","juice"};




    }

    public void linkListArray(){

        String x[] = {"susage","garlic","bacon","hambgu"};

        List<String> list1 = new LinkedList<>();
        for(String o : x)
            list1.add(o);

        System.out.println("list1 size before add list2"+list1.size());
        String y[] = {"cranch","nuglest","donats"};

        List<String> list2 = new LinkedList<>();
        for(String t : y)
            list2.add(t);

        list1.addAll(list2);

        System.out.println("list1 size after add list2"+list1.size());

        //list2 = null;

        printMe(list1);
        removeMe(list1,2,4);
        printMe(list1);
        reverMe(list1);
    }

    public void printMe(List<String> l){

        for (String u : l)
        System.out.printf("%s ",u  );
        System.out.println();
    }
    public void removeMe(List<String> l, int from, int to){

        l.subList(from,to).clear();
       // System.out.println(l);//

    }
//
    public void reverMe(List<String> l){

        ListIterator<String> bobby = l.listIterator(l.size()); // iterate from end of list
        while (bobby.hasPrevious())  // start from last of list
            System.out.printf("%s ",bobby.previous());  //print from last
    }
}

