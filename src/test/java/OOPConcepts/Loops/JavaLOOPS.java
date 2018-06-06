package OOPConcepts.Loops;

public class JavaLOOPS {

    public static void main(String[] args){

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        //Loop while

        int i=3;

        while (i>=1){
            System.out.println(i);

            i=i-1;
        }
        System.out.println("######");
        //2for Loop
        for(int j=1;j<=4;j++){
            System.out.println(j);
        }

        System.out.println("######");

        for(int k=4;k>=3;k--){
            System.out.println(k);

        }

        int t =1;
        int y=t++; //post increment
        System.out.println(t);
        System.out.println(y);

        System.out.println("//pre increment");
        int ta =1;
        int ya=++ta; //pre increment
        System.out.println(ta);
        System.out.println(ya);

        System.out.println("//pre dreament");
        int taa =1;
        int yaa=--taa; //pre dreament
        System.out.println(taa); //0
        System.out.println(yaa); //0

        System.out.println("//post dreament");
        int taaa =1;
        int yaaa=taaa--; //post dreament
        System.out.println(taaa);//0
        System.out.println(yaaa); //1

    }
}

