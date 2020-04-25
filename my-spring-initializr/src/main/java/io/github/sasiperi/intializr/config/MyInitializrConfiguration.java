package io.github.sasiperi.intializr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.spring.initializr.metadata.InitializrProperties;
import io.spring.initializr.web.support.InitializrMetadataUpdateStrategy;

@Configuration
@EnableConfigurationProperties(CustomInitializrProperties.class)
class MyInitializrConfiguration {

    @Bean
    public void customInitializrMetadataProvider(CustomInitializrProperties InitializrProperties, InitializrMetadataUpdateStrategy initializrMetadataUpdateStrategy)
    {
    
    }
            
}

@ConfigurationProperties("custom")
class CustomInitializrProperties {

    @NestedConfigurationProperty
    InitializrProperties initializr = new InitializrProperties();
}

}