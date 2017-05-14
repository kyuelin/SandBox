package dev.kyuelin.sbox101.generator.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kennethlin on 5/14/17.
 */
public class OutputHelper {
    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    @Autowired
    Generator generator;

    public void output() {
        generator.generate();
    }
}
