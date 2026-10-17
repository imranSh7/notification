package in.notification.imran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.notification.imran.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
