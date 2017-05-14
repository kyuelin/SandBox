package dev.kyuelin.sbox101.generator.configs;

import dev.kyuelin.sbox101.generator.domain.Generator;
import dev.kyuelin.sbox101.generator.domain.JsonGenerator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by kennethlin on 5/14/17.
 */
@Configurable
public class GeneratorConfig {

    @Bean(name = "generator")
    public Generator getGenerator() {
        return new JsonGenerator();
    }
}
