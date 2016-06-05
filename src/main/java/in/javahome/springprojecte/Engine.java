package in.javahome.springprojecte;

import org.springframework.stereotype.Component;

@Component
public class Engine implements IEngine {
	public void start() {
		System.out.println("Engine started..");
	}

	public void stop() {
		System.out.println("Engine stopped..");
	}
}
