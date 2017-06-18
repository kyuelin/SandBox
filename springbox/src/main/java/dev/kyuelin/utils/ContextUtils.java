package dev.kyuelin.utils;

import com.google.common.base.Verify;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kennethlin on 5/14/17.
 */
public final class ContextUtils {

    public static ApplicationContext getContext(ApplicationContext context, Class[] configClasses) {
        if (null == context) {
            context = new AnnotationConfigApplicationContext(configClasses);
        }
        Verify.verifyNotNull(context);
        return context;
    }
}
