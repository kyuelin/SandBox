package dev.kyuelin.sboxdemo; /**
 * Created by kennethlin on 4/26/17.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringboxDemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringboxDemo.class, args);
    }

}

