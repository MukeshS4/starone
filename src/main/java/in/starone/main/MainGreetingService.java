package in.starone.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.starone.service.GreetingService;

public class MainGreetingService {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		GreetingService gs = ctx.getBean(GreetingService.class,"greetingService");
		gs.greet();
	
		

	}
}
