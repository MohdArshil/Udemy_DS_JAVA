package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vehicles.Engine;
import vehicles.Vehicle;

public class Client {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Vehicle car1 = new Vehicle((Engine) context.getBean("engine"));
		car1.crankIgnition();
	}
}
