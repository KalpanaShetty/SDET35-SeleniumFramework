package parsingSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.CompanyPojo;
import com.parsing.pojo.EmployeeDetailsPojo;

public class CompanyDetailsObjectArrayTest {
	@Test
	public void details() throws JsonGenerationException, JsonMappingException, IOException{
		EmployeeDetailsPojo pojo1 = new EmployeeDetailsPojo("kalpanaShetty", "ty001", "9999", "ks@gmail.com");
		EmployeeDetailsPojo pojo2 = new EmployeeDetailsPojo("nayanaShetty", "ty002", "9998", "ns@gmail.com");
		Object[] obj={pojo1,pojo2};
		int[] cmpPhoneNo={2222,4444};
	CompanyPojo cmpPojo = new CompanyPojo("tyss", "3500", cmpPhoneNo, obj);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./complexJasonData.json"), cmpPojo);
	}

}
