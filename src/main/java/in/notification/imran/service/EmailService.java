package in.notification.imran.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import in.notification.imran.event.PaymentCompletedEvent;

@Service
public class EmailService {
	
	 private static final Logger logger =
	            LoggerFactory.getLogger(EmailService.class);

	    public void send(PaymentCompletedEvent event) {

	        logger.info("Sending Email to customer {}", event.getCustomerId());

	        // SMTP code later
	    }

}
