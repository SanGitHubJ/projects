package Encapsulations;

///Encapsulation is binding data with methods
//Variable always Private and Getter and Setter always public
//The purpose of encapsulation is SAFTY OF DATA

public class Student {

    private int age ;
    private String name;

    //Getter is to get fetch data and setter is to set data

    //Setters
    public void setAge(int a){

        this.age = a;
    }

    public void setName(String n){

        this.name =n;
    }

    //Getters
    public int getAge(){

        return age;
    }

    public String getName(){

        return name;
    }



}
