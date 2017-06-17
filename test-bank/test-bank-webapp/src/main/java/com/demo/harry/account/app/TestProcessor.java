package com.demo.harry.account.app;

import com.demo.harry.account.input.Profile;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by Dell on 17/06/2017.
 */
public class TestProcessor implements Processor
{
    public void process(Exchange exchange) throws Exception {

       String body = exchange.getIn().getBody(String.class);
        System.out.println( " printing body here " +body);
      //  System.out.println( " printing body here " +body.getAccountList().get(0).getCurrent());
       exchange.getIn().setBody(body);

        System.out.println( " printing headers  here " +exchange.getIn().getHeaders());

    }
}
