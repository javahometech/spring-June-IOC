package in.javahome.springprojecte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(MyJavaIOC.class);
		Car car = ioc.getBean(Car.class);
		car.start();
		car.stop();
	}
}
