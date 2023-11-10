package com.java.threads.methods;

import com.java.threads.creation.ImplementingRunnableInterface;

public class ThreadsmethodsDemo implements Runnable{
    String name;
    Thread thread;
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new ThreadsmethodsDemo();

        System.out.println("The priority of the current thread is -> "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(3);
        System.out.println("The priority of the thread after changing the priority -> "+Thread.currentThread().getPriority());

        System.out.println("--------------------------------------------------------------------");

        System.out.println("The name of the thread is -> "+Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread");
        System.out.println("The name of the thread after changing its name is -> "+Thread.currentThread().getName());

        System.out.println("--------------------------------------------------------------------");

        System.out.println("The present id of the thread is -> "+Thread.currentThread().getId());

        System.out.println("--------------------------------------------------------------------");

        System.out.println("This returns weather the thread is alive or not -> "+Thread.currentThread().isAlive());

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Returns weather the current thread is DAEMON or not -> "+Thread.currentThread().isDaemon());
    }
}
