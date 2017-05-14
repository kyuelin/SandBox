package dev.kyuelin.sbox101.generator.configs;

import dev.kyuelin.sbox101.generator.domain.OutputHelper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by kennethlin on 5/14/17.
 */
@Configurable
public class OutputConfig {

    @Bean(name="outputhelper")
    public OutputHelper getOutputHelper() {
        return new OutputHelper();
    }
}
