package in.javahome.springprojecte;

import java.util.List;

public class CollectionBean {
	private List<String> myLisy;

	public void setMyLisy(List<String> myLisy) {
		this.myLisy = myLisy;
	}
	
	public void showMyList(){
		for (String x : myLisy) {
			System.out.println(x);
		}
	}
	
}
