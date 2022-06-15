package parsingSerialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary2;

public class EmployeeLibraryArrayTest {
@Test
public void serialization() throws JsonGenerationException, JsonMappingException, IOException{
	long[] arr={326496,59664,5446};
	
	PojoLibrary2 pobj = new PojoLibrary2("KalpanaShetty", "ty001", "kalpana@gmail.com", arr);
      ObjectMapper mapper = new ObjectMapper();
      System.out.println(mapper.writeValueAsString(pobj));
      mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jasonArrayFile.jason"), pobj);


}
}
