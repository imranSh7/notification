package in.notification.imran.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import in.notification.imran.event.PaymentCompletedEvent;

@Service
public class SmsService {
	
	private static final Logger logger =
            LoggerFactory.getLogger(SmsService.class);

    public void send(PaymentCompletedEvent event) {

        logger.info("Sending SMS to customer {}", event.getCustomerId());

        // Twilio / MSG91 code later
    }

}
