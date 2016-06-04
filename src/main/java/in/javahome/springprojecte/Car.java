package in.javahome.springprojecte;

public class Car {
	private IEngine eng;

	public void setEng(Engine eng) {
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
