package ${package}.configuration;

import ${package}.configuration.properties.${classPrefix}Properties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ${package}.core.services.${classPrefix}Service;

@Configuration
@ConditionalOnProperty(prefix = "${propertyPrefix}", name = "enabled", havingValue = "true", matchIfMissing = true)
@ConditionalOnWebApplication
@EnableConfigurationProperties(${classPrefix}Properties.class)
public class ${classPrefix}AutoConfiguration {

    @Bean
    public ${classPrefix}Service ${methodPrefix}Service(){
        return new ${classPrefix}Service();
    }

}
