package dev.kyuelin.sbox101;

import com.google.common.base.Verify;
import dev.kyuelin.sbox101.generator.configs.GeneratorConfig;
import dev.kyuelin.sbox101.generator.domain.OutputHelper;
import dev.kyuelin.sbox101.generator.configs.OutputConfig;
import dev.kyuelin.sbox101.iapp.AppConfig;
import dev.kyuelin.sbox101.iapp.IApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kennethlin on 5/13/17.
 */
public class Springbox101 {
    public static void main(String[] args) {
        // load context from xml, otherwise config classes
        ApplicationContext context = null;
        //context = new ClassPathXmlApplicationContext("Springbox101Context.xml");

        // start iapp
        //startIapp(context);

        // start generator
        startGenerator(context);
    }

    private static void startGenerator(ApplicationContext context_in) {
        ApplicationContext context = getContext(context_in, new Class[] {GeneratorConfig.class, OutputConfig.class});
        OutputHelper outputHelper = (OutputHelper) context.getBean("outputhelper");
        outputHelper.output();
    }

    private static void startIapp(ApplicationContext context_in) {
        ApplicationContext context = getContext(context_in, new Class[] {AppConfig.class});
        IApplication application = (IApplication) context.getBean("appBean");
        application.start();
    }

    private static ApplicationContext getContext(ApplicationContext context, Class[] configClasses) {
        if (null == context) {
            context = new AnnotationConfigApplicationContext(configClasses);
        }
        Verify.verifyNotNull(context);
        return context;
    }
}
