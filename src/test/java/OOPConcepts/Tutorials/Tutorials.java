package OOPConcepts.Tutorials;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tutorials {

    public static void main(String args[]){

        Tutorials tst = new Tutorials();
        tst.fib_number();
        tst.squre_number();

        int a[] = {5, 3, 6, 4, 1, 2};
        System.out.println("small umber is :"+tst.check_smallnumber(a));

        System.out.println("min is"+tst.minNumberInAyyar(a));

        tst.find_binaryGap(8);

        tst.countVowels();

        System.out.println(tst.remove_alpha("A8yh67hnb56df"));

        System.out.println("after remove duplicate:"+tst.removeDplicate("apple"));

        tst.patterOne();

    }

    public void fib_number() { //1,1,2,3,5,8,13

        int a =1, b =1,k;
        k=0;


        Scanner sr = new Scanner(System.in);

        System.out.println("enter number:");
        int n = sr.nextInt();
        System.out.print("1 1");
        while(k<n){

            k = a + b;
            if (k>=n)
                break;
            System.out.print(" "+k);
            a= b;
            b=k;


        }
    }


    public void squre_number(){

        int j=0,k,h=0;
        int sum[] ={1,3,4,9};

        while (j<sum.length){

            // j = sum*sum;
            //System.out.println( j*j);
            k = sum[j]*sum[j];
            for(int i=0;i<sum.length;i++) {
                if (k == sum[i])
                    h += 1;
                    //break;
            }

            j++;

        }
        System.out.println("\nNumber of squre number occurance is:"+h);
    }

    public int check_smallnumber(int a[]) {

        int i = 0, d = 0;

        while (i < a.length) {

            for (int j = 1; j <= a.length; j++) {

             //  if (j==a[j]) {

                    //d = j;

                    //break;
               // }
                //i++;
            }

            i++;

           // return d;


        }
        return d;
    }

    public int minNumberInAyyar(int a[]){

        int minnum = a[0];
        for (int i=0;i<a.length;i++){

            if (a[i]<minnum){
                minnum = a[i];
            }
        }
        return minnum;
    }

    public void find_binaryGap(int a){

        //String e,o;
        if (a % 2 == 0){

            System.out.println("even num");;
        }else
            System.out.println("odd num");

    }

    //To find the vowels in given words

    public void countVowels(){

        System.out.println("Enter word");


        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char wa[] = a.toCharArray();
        int count = 0;
        System.out.println(a.toUpperCase());
        System.out.println("to check string char:"+a.charAt(0));
        System.out.println("to check string char:"+a.charAt(1));
        System.out.println("to check string char:"+a.charAt(2));
        System.out.println("to check string char:"+(a.charAt(3)));
        //System.out.println("to check string char:"+a.charAt(4));



        for (char vo : wa){

            switch (vo){

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count ++;


            }

        }
        System.out.println("vowel count is:"+count);

    }

    //to remove the charactor in given alphanumeric

    public String remove_alpha(String a){


        StringBuffer sb = new StringBuffer(a);

        for (int i=0;i<sb.length();i++){

            if (sb.charAt(i)<47 || a.charAt(i) >57){  /// here <47 and > 57 mean ASSCI charactor start mean number in between 47-57[0-9]

                sb.deleteCharAt(i);  //78h67hnb56df
                i--;
            }

        }

        return sb.toString();
    }

    //to remove duplicate charactor in word
    public String removeDplicate(String a){

        Set<Character> hs = new HashSet<>();

        StringBuffer sb = new StringBuffer();
        System.out.println("before remove duplicate:"+a);
        for (int i=0;i<a.length();i++){

            Character t = a.charAt(i);

            if (!hs.contains(t)){
                hs.add(t);
                System.out.println("hasMap value are ::"+hs);
                sb.append(t);

            }
        }

        return sb.toString();



    }

    //print pattern

    public void patterOne(){

        for (int i=1;i<8;i++){
            for (int j=0;j<i;j++){

                System.out.print(j);
                //System.out.println();

            }
            System.out.println(9);
        }
        char alpa[] = {'A','B','C','D'};
        for(int i=1;i<=4;i++){
            for (int j=0;j<i;j++){
                System.out.print(alpa[j]);

            }
            System.out.println();
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<i;j++){
                if (i!=j) {
                    break;
                }else {
                    System.out.print("$");
                }
            }
        }

        //ehance for loop for 2D array

        int i[][] = {{4,5,6,7},{6,5,4,7},};
        for (int j[]: i){
            for (int d: j){
                System.out.print(d+" ");
            }
            System.out.println("\n");
        }
    }


}
