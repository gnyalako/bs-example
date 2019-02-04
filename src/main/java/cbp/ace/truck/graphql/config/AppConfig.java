package cbp.ace.truck.graphql.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "cbp.ace.truck.graphql")
public class AppConfig {
    @Bean
    public Mapper mapper(){
        return new DozerBeanMapper();
    }

}
