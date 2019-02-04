package cbp.ace.truck.graphql;

import cbp.ace.truck.graphql.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(AppConfig.class)
public class AppTest {
    @Test
    public void test(){

    }
}

