package in.starone.service;

public class OrderService {
	private EmailService emailService;

	public OrderService(EmailService emailService) {
		this.emailService = emailService;
	}



	public void placeOrder() {
	
		System.out.println("Order Placed...");
		emailService.sendMail();
			
	}

}
