 class CheckArrary {

    public static void main(String args[]){

        int[] A = {4,5,6,7,8,9,10,11,12,13,14,15,16,17};

       // int A =4;
       // int B =17;

        CheckArrary tc = new CheckArrary();

           int cnt = tc.solution(A);

        System.out.println(cnt);

        //int result = solution(a);
        //System.out.println(result;

        int Q[] = {1,2,3,4,5};

        System.out.println("The array lenght is>>"+tc.countArray(Q));

    }



    public  int solution(int A[]) {
        // write your code in Java SE 8
       // int c  = 0;
       int count =0;
            for(int i=0; i<A.length; i++) {
                //int count =0;
                int b = i*i;

                System.out.println(A[i]);

                if (A[i]==b){

                    //count = 0 ;
                    count++;
                   // return count;
                }
            }
            return count;
        }

        public int countArray(int W[]){

        int R=0;

        for (int i=0;i<W.length;i++){

            if (W[i]!=(-4)){

                R++;
            }

        }

        return R;


        }
    }

