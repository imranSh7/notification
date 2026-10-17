package in.notification.imran.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import in.notification.imran.entity.Notification;
import in.notification.imran.event.PaymentCompletedEvent;
import in.notification.imran.repository.NotificationRepository;

@Service
public class NotificationService {

	private final NotificationRepository notificationRepository;
    private final EmailService emailService;
    private final SmsService smsService;

    public NotificationService(NotificationRepository notificationRepository,
                               EmailService emailService,
                               SmsService smsService) {
        this.notificationRepository = notificationRepository;
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendNotification(PaymentCompletedEvent event) {

        Notification notification = new Notification();

        notification.setPaymentId(event.getPaymentId());
        notification.setCustomerId(event.getCustomerId());
        notification.setType("PAYMENT");
        notification.setTitle("Payment Successful");
        notification.setMessage(
                "Your payment of ₹" + event.getAmount() + " was successful."
        );
        notification.setStatus("PENDING");
        
        notification.setCreatedAt(LocalDateTime.now());

        notificationRepository.save(notification);

        try {

            emailService.send(event);

            smsService.send(event);

            notification.setStatus("SENT");

        } catch (Exception ex) {

            notification.setStatus("FAILED");

        }

        notificationRepository.save(notification);
    }
}
