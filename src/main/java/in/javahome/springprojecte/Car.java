package in.javahome.springprojecte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	public void myInit(){
		System.out.println("myInit()...");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy()...");
	}
	
	@Autowired
	@Qualifier
	private IEngine eng;

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void start() {
		eng.start();
		System.out.println("Started The car");
	}

	public void stop() {
		eng.stop();
		System.out.println("Stopped the car");
	}
}
