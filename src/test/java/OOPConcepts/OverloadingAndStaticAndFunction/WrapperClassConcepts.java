package OOPConcepts.OverloadingAndStaticAndFunction;

public class WrapperClassConcepts {

    public static void main(String[] args){

        String x ="20";

        System.out.println(x+200);

        // data conversion from String to Int
        //Integrer, Double,booln
        int i = Integer.parseInt(x);

        System.out.println(i);
        System.out.println(i+300);

        String y = "4.44";

        double t = Double.parseDouble(y);

        System.out.println(t+4.15);

        String k = "true";
        boolean o = Boolean.parseBoolean(k);
        System.out.println(o);

        int j = 9;
        String w= String.valueOf(j);
        System.out.println(w+ 14);

        String u = "100A";

        Integer.parseInt(u);
    }
}
