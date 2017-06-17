package account.app;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 585152 on 6/15/2017.
 */
public class MainApp {


    public static void main(String[] args) throws Exception {

        CamelContext camelContext = null;
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-application-context.xml");
            camelContext = (CamelContext) context.getBean("camel.context");
            ProducerTemplate template = camelContext.createProducerTemplate();
            camelContext.start();
            template.sendBody("demoRoute", "Hi camel");
            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            camelContext.stop();
        }

    }
}