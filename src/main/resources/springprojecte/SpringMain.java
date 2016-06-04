package springprojecte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springprojecte.Car;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		Car c = (Car)ioc.getBean("myCar");
		c.start();
		c.stop();
	}
}
