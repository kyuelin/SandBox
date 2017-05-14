package dev.kyuelin.sbox101.iapp.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by kennethlin on 5/13/17.
 */
public class HerApplication implements IApplication  {

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    @Value("Ciao!")
    private String greetings;

    public void start() {
        System.out.println(this.getClass().getName() + " " + greetings);
    }
}
