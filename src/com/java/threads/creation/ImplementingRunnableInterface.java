package com.java.threads.creation;

public class ImplementingRunnableInterface implements Runnable{
    String name;
    Thread thread;
    ImplementingRunnableInterface (String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println( "A New thread: " + name+ "is created\n" );
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int j = 5; j > 0; j--) {
                System.out.println(thread + ": " + j);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " thread Interrupted");
        }
        System.out.println(name + " thread exiting.");
    }

    public static void main(String[] args) {
        new ImplementingRunnableInterface("1st");
        new ImplementingRunnableInterface("2nd");
        new ImplementingRunnableInterface("3rd");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException excetion) {
            System.out.println("Interruption occurs in Main Thread");
        }
        System.out.println("We are exiting from Main Thread");
    }
}

