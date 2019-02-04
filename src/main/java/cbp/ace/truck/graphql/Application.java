package cbp.ace.truck.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import cbp.ace.truck.graphql.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
