package in.starone.service;

public class EmailService {
	private String serverconfig;
	
	public EmailService(String serverconfig) {
		this.serverconfig = serverconfig;
	}
	
	public void sendMail() {
		serverconfig="some server details";
		System.out.println("Mail sent....");
	}

}
