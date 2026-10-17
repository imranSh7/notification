package in.notification.imran.event;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import in.notification.imran.service.NotificationService;

@Component
public class NotificationEventConsumer {
	
	private final NotificationService notificationService;

    public NotificationEventConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RabbitListener(
            queues = "${rabbitmq.queue}",
            containerFactory = "rabbitListenerContainerFactory")
    public void consume(PaymentCompletedEvent event) {
        System.out.println("########## MESSAGE RECEIVED ##########");


        notificationService.sendNotification(event);
    }

}
