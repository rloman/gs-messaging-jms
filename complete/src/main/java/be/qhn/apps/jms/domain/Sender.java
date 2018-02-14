package be.qhn.apps.jms.domain;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {
   
   @Autowired
   private JmsTemplate jmsTemplate;

   @Scheduled(cron="*/10 * * * * *")
   public void send() {
      // Send a message with a POJO - the template reuse the message converter
      System.out.println("Sending an email message.");
      jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello at timestamp "+LocalDateTime.now()));
      
      System.out.println("Sending a feature request to support");
      jmsTemplate.convertAndSend("featureIn", new Feature(1, "Raadplegen VA", "Raadplegen VA test als 1 dan return 333.33"));

   }
   
   
   

}
