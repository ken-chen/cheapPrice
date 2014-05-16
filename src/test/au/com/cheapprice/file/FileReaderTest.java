package au.com.cheapprice.file;

import java.util.List;

import org.junit.Test;

/**
 * @author kchen
 *
 */
/**
 * @author kchen
 *
 */
public class FileReaderTest {
	
	@Test
	public void testFileReader(){
		
		System.out.println("start");
		String fileName = "/Powerball.csv";
		List<String> results = FileReader.getStringResutsFromDatFile(fileName);
		
		
		System.out.println(results);
	}
}
