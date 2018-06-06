package OOPConcepts.ArrayListConcepts;

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args){

        // in array we have InDEXES but HAS Table have KEYS
        Hashtable ht = new Hashtable();

        ht.put("A","TestA");
        ht.put("B","TestB");
        ht.put("C","TestC");

        System.out.println(ht.size());

        ht.put(1,100);

        System.out.println(ht.size());

        ht.remove("B");
        System.out.println(ht.size());

        System.out.println(ht.get(1));
        System.out.println(ht.get("C"));

        Hashtable<Integer,String> h = new Hashtable<Integer, String>();

        h.put(1,"TOM");
       // h.put("S",2); NOT allowed bvx accepted Int,String format  for Key/Val
        System.out.println(h.get(1));




    }
}
