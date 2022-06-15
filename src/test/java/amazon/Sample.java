package amazon;

import org.testng.annotations.Test;

public class Sample {

	@Test(invocationCount=4)
	public void sample(){
		
		System.out.println("hi");
	}
}
