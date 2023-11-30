package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.internal.Systematiser;

public class UtilityClass {
	public static String getDataFromPF(String key) throws IOException {
		
		//FileInputStream file = new FileInputStream("C:\\Users\\91997\\eclipse-workspace\\E-CommerceAmazon\\ConfigFile.properties");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ConfigFile.properties");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	 public static String getExcelData(int rowIndex, int cellindex) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Amazon.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DC");
		 String value = sh.getRow(rowIndex).getCell(cellindex).getStringCellValue();
		 return value;
		
	}
	

}
