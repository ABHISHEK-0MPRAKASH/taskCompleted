package com.java.abstractiondemo.abstractionexampledemo;

import static java.lang.System.exit;

public class Service {
    public user createuser(int id) {
        user ui;
        if (id == 1) {
            ui = new Atm();
            System.out.println("Object of Atm is created");
            return ui;
        } else if(id == 2){
            ui = new MoblieBanking();
            System.out.println("Object of MoblieBanking is created");
            return ui;
        }
        else{
            return null;
        }
    }
}