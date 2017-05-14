package dev.kyuelin.sbox101;

import dev.kyuelin.sbox101.domain.IApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kennethlin on 5/13/17.
 */
public class Springbox101 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IApplication application = (IApplication) context.getBean("appBean");
        application.start();
    }
}
