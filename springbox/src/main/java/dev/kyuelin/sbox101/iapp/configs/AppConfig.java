package dev.kyuelin.sbox101.iapp.configs;

import dev.kyuelin.sbox101.iapp.domain.HerApplication;
import dev.kyuelin.sbox101.iapp.domain.IApplication;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
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
