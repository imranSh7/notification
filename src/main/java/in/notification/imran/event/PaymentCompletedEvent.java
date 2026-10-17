package in.notification.imran.event;

import java.io.Serializable;

public class PaymentCompletedEvent implements Serializable {

	private Long paymentId;
	private Long checkoutId;
	private Long customerId;
	private String customerName;
	private Double amount;
	private String paymentMethod;
	private String transactionId;
	private String status;

	public PaymentCompletedEvent(Long paymentId, Long checkoutId, Long customerId, String customerName, Double amount,
			String paymentMethod, String transactionId, String status) {
		super();
		this.paymentId = paymentId;
		this.checkoutId = checkoutId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionId = transactionId;
		this.status = status;
	}

	public PaymentCompletedEvent() {
		super();
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(Long checkoutId) {
		this.checkoutId = checkoutId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
