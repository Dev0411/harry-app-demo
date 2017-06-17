package com.demo.harry.account.app;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 585152 on 6/17/2017.
 */
public class MainApp {


    public static void main(String[] args) throws Exception {
        while (process()) ;

    }


    public static boolean process() throws Exception {
        CamelContext camelContext = null;
        ProducerTemplate template = null;
        Object body = null;
        String choice = null;
        boolean runagain = false;
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-application-context.xml");
            camelContext = (CamelContext) context.getBean("camel.context");
            template = camelContext.createProducerTemplate();
            camelContext.start();

            System.out.println("**************************************************************");
            System.out.println("     Welcome Mr.Harry Use below options to manage your accouts using demo Application ! ");
            System.out.println("*********** Developed by PAWAN ********************");
            System.out.println("**************************************************************");
            System.out.println("Enter your Choice: ");
            System.out.println("To view account summary press 1");
            System.out.println("To view current accounts summary press 2");
            System.out.println("To view savings accounts summary press 3");
            System.out.println("To view deposits summary press 4");
            System.out.println("To view cards summary press 5");
            System.out.println("To view loans summary press 6");
            System.out.println("To exit press 7");
            System.out.println("**************************************************************");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            choice = br.readLine();

            if (choice.equals("1")) {
                body =  template.requestBodyAndHeader("direct:demoRoute", "1","case","1");
            } else if (choice.equals("2")) {
                body =  template.requestBodyAndHeader("direct:demoRoute", "2","case","2");
            } else if (choice.equals("3")) {
                body =  template.requestBodyAndHeader("direct:demoRoute", "3","case","3");
            } else if (choice.equals("4")) {
                body = template.requestBodyAndHeader("direct:demoRoute", "4","case","4");
            } else if (choice.equals("5")) {
                body = template.requestBodyAndHeader("direct:demoRoute", "5","case","5");
            } else if (choice.equals("6")) {
                body = template.requestBodyAndHeader("direct:demoRoute", "6","case","6");
            } else {
                System.out.println("Wrong Choice!!!");

            }
            Thread.sleep(500);
            System.out.println("Printing body = " + body);

            System.out.println("Want to run again ? y/n");



            String str2 = br.readLine();
            if ((str2.equalsIgnoreCase("y")) || (str2.equalsIgnoreCase("yes"))) {
                runagain = true;
            } else {
                System.out.println("Thank you for using the Demo Application !!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            camelContext.stop();
        }

        return runagain;
    }
}