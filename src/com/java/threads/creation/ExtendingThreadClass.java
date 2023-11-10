package com.java.threads.creation;

public class ExtendingThreadClass extends Thread{
    public void run(){
    int a= 10;
    int b=12;
    int result = a+b;
    System.out.println("Thread started running..");
    System.out.println("Sum of two numbers is: "+ result);
}
    public static void main( String args[] )
    {
        ExtendingThreadClass t1 = new  ExtendingThreadClass();
        t1.start();
    }

}
