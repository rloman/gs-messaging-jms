package be.qhn.apps.jms.domain;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }
    
    @JmsListener(destination="featureIn", containerFactory="myFactory")
    public void receiveMessage(Feature feature) {
       System.out.println("Received <"+feature+">");
    }

}
