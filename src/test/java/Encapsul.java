package Encapsulations;

public class Encapsul extends Student{

    public static void main(String args[]){

        Student st = new Student();

        st.setAge(48);
        System.out.println("Age is:"+st.getAge());

        st.setName("jack");
        System.out.println("Name is:"+st.getName());
    }
}
