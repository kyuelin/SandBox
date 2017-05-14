package dev.kyuelin.sbox101.domain;

/**
 * Created by kennethlin on 5/13/17.
 */
public class HerApplication implements IApplication  {
    public void start() {
        System.out.println(this.getClass().getName() + " chao.");
    }
}
