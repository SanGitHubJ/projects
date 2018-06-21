package OOPConcepts.ArrayListConcepts;

public class MyTestArray {

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6};
        MyTestArray test = new MyTestArray();

        int u = test.sumOfArray(arr);
        System.out.println(arr.length);
        System.out.println(u);


    }

    public int sumOfArray(int x[]){

        int sum=0;

        for(int a=0;a<x.length;a++){


            sum=x[a]+sum;

           // return sum;

        }
        return  sum;
    }
}
