package dev.kyuelin.sbox101.iapp;


/**
 * Created by kennethlin on 5/13/17.
 */
public class MyApplication implements IApplication {
    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    private String greetings;
    public void start() {
        System.out.println(this.getClass().getName()+ " " + greetings);
    }
}