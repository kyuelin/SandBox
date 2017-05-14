package dev.kyuelin.sbox101.domain;


/**
 * Created by kennethlin on 5/13/17.
 */
public class MyApplication implements IApplication {
    public void start() {
        System.out.println(this.getClass().getName()+ " started.");
    }
}