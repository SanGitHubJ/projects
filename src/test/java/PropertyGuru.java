public class PropertyGuru {


    public static void main(String[] args) {

        PropertyGuru pg = new PropertyGuru();

        int nv[] ={1, 3, 6, 4, 1, 2};


       // int nv =5;

        int rt= pg.checkMinvalueFive(nv);


        System.out.println(rt);
        System.out.println("finish5");

        int re[] = {1, 2, 3};
        int r = pg.checkMinvalueFour(re);

        System.out.println(r);
        System.out.println("finish4");

        int yu[]={1, 2, 3};

        int q = pg.checkMinvalueOne(yu);

        System.out.println(q);
        System.out.println("finish1");


    }

    public int checkMinvalueFive(int x[]) {

       // int a[] = {1, 3, 6, 4, 1, 2}; //new int[6];
        int a=5;

        for (int i = 0; i < x.length; i++) {
            if (a == x[i]) {
                System.out.println(" value 5 is not found"+x[i]);
                //  break;
            }
        }

        return a;
    }


    public int checkMinvalueFour(int x[]) {

       // int a[] = {1, 2, 3}; //new int[6];

        int a=4;

        for (int i = 0; i < x.length; i++) {
            if (a == x[i]) {
                System.out.println(" value 4 is not found");
                //  break;
            }
        }

        return a;

    }

    public int checkMinvalueOne(int x[]) {

       // int a[] = {1, 2, 3}; //new int[6];

        int a =1;

        for (int i = 0; i < x.length; i++) {
            if (a == x[i]) {
                System.out.println(" value 1 is not found");
                //  break;
            }
        }

        return a;

    }

}
