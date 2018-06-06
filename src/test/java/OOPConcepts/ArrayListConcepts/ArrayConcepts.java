package OOPConcepts.ArrayListConcepts;

public class ArrayConcepts {

    public static void main(String[] args){

        //Array disadvantage
        //1> Size is fixed To Over Come we use >> collection, ArrayList, HasTable
        //2> can store similer data types  To over come we use OBJECTS ARRAY

        int i[] = new int[4];

        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        //System.out.println(i[4]); //arrayout of bound

        System.out.println(i.length); //size of array

        //print all value in array

        for(int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }

        //these are STATICS ARRAY BCX SIZE IS FIXED
        //2. double array
         double t[] = new double[4];
        t[0] = 60.44;
        t[1] = 45.33;
        t[2] = 34.22;

        System.out.println(t[2]);

        //3> Object Array is SUPPER CLASS

        Object ob[] = new Object[4];

        ob[0] = "Tmo";
        ob[1] = 24;
        ob[2] = 34.22;
        ob[3] = "M";
        System.out.println(ob[0]);
        System.out.println(ob[2]);
        System.out.println(ob.length);

        for(int aq=0;aq<ob.length;aq++){

            System.out.println(ob[aq]);
        }
    }




}
