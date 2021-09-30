package in.starone.service;

public class MainOrder {
	public static void main(String[] args) {
		EmailService es = Container.getEmailService();
		OrderService os1 = Container.getOrderService();
		OrderService os2 = Container.getOrderService();
		System.out.println(os1);
		System.out.println(os2);
		os1.placeOrder();
	}

}
