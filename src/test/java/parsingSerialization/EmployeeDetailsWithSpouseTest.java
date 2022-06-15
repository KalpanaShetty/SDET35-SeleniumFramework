package parsingSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibraryWithSpouseDetails;
import com.parsing.pojo.PojoSpouseLibrary;

public class EmployeeDetailsWithSpouseTest {
@Test
public void serialization() throws JsonGenerationException, JsonMappingException, IOException{
	PojoSpouseLibrary spouse = new PojoSpouseLibrary("abc", "abc@gmail.com", 85216);
	PojoLibraryWithSpouseDetails pobj = new PojoLibraryWithSpouseDetails("kalpanaShetty", "ty001", "kalpan@gmail.com", spouse);

ObjectMapper mapper = new ObjectMapper();
System.out.println(mapper.writeValueAsString(pobj));

mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jasonspouse.json"), pobj);
}
}
