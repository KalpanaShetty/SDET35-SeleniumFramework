package parsingSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;

public class EmployeeLIbraryTest {
	@Test
	public void serialization() throws IOException, JsonMappingException, IOException{
		
	
		//to use the pojo library we are creating the object 
		PojoLibrary pobj = new PojoLibrary("Kalpana Shetty", "Ty001", "kalpana@gmail.com", 84317);
		
		//converting java object into jason object to use the nonstatic method of jackson tool we added in dependency
		ObjectMapper mapper = new ObjectMapper();
		
		
		//printing the jason object in the console
		System.out.println(mapper.writeValueAsString(pobj));
		
		//generating the jason file
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonFile.jason"), pobj);
	}

}
