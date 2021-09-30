package in.starone.service;


//manage lifecyle of all components and depend. control
public class Container {
	private static String serverconfig;
	private static EmailService emailService = new EmailService(serverconfig);
	private static OrderService orderService = new OrderService(emailService);
	
	public static EmailService getEmailService() {
		return emailService;
	}
	public static OrderService getOrderService() {
		return orderService;
	}
	

}
