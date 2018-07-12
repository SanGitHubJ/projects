class CheckArrarys {

    public static void main(String args[]){

        CheckArrarys tc = new CheckArrarys();


        int Q[] = {1,4,-1,3,2};

        System.out.println("The array lenght is::"+tc.countArray(Q));

    }




   public int countArray(int W[]){

        int R=0;

        for (int i=0;i<W.length;i++){

            if (W[i]!=(-1)){

                R++;
            }

        }

        return R;


    }
}

