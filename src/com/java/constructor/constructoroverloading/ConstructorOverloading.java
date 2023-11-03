package com.java.constructor.constructoroverloading;

public class ConstructorOverloading {
   public ConstructorOverloading(){
       System.out.println("this is zero paramter constructor");
    }
    public ConstructorOverloading(int i , int j){
        System.out.println("this is parameterized constructor with 2 integer variables->"+i+","+j);
    }
    public ConstructorOverloading(char a , int b){
        System.out.println("this is a parameterized constructor with char and int variable->"+a+","+b);
    }


    public static void main(String[] args) {
       new ConstructorOverloading();
       new ConstructorOverloading(2,3);
       new ConstructorOverloading('a' ,7);

    }
}
