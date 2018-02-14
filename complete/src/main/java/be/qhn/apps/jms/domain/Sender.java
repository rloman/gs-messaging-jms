package be.qhn.apps.jms.domain;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
   
   @Autowired
   private JmsTemplate jmsTemplate;

   @PostConstruct
   public void init() {
      
      for(;;) {
         try {
            Thread.sleep(5000);
            send();
         }
         catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
     
      
   }
   
   public void send() {
      // Send a message with a POJO - the template reuse the message converter
      System.out.println("Sending an email message.");
      jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));
      
      System.out.println("Sending a feature request to support");
      jmsTemplate.convertAndSend("featureIn", new Feature(1, "Raadplegen VA", "Raadplegen VA test als 1 dan return 333.33"));

   }
   
   
   

}
