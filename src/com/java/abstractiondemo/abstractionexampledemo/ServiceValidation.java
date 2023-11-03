package com.java.abstractiondemo.abstractionexampledemo;

import static java.lang.System.exit;

public class ServiceValidation {
    public static void validation(int input){
        Service service = new Service();

        if (input == 1 || input == 2){
            user user1 = service.createuser(input);
            user1.transfer();
        }
        else{
            System.out.println("wrong input");
            exit(0);
        }

    }
}
