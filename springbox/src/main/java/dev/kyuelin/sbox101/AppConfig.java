package dev.kyuelin.sbox101;

import dev.kyuelin.sbox101.domain.HerApplication;
import dev.kyuelin.sbox101.domain.IApplication;
import dev.kyuelin.sbox101.domain.MyApplication;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by kennethlin on 5/13/17.
 */
@Configurable
public class AppConfig {

    @Bean(name = "appBean")
    public IApplication application() {
        return new HerApplication();
    }
}
