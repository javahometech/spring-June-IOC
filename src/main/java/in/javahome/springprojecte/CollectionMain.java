package in.javahome.springprojecte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("javahome-ioc.xml");
		CollectionBean bean = context.getBean(CollectionBean.class);
		bean.showMyList();
	}
}
