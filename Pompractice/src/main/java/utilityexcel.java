import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class utilityexcel {
	
	
	
	
	
	@Test
	public void excel() throws EncryptedDocumentException, FileNotFoundException, IOException {
	Workbook book=WorkbookFactory.create(new FileInputStream("C:\\Users\\Sanket Raut\\OneDrive\\Desktop\\POM practice.xlsx"));
	Sheet s = book.getSheet("Sheet1");
	
	for (int i = 1; i <= s.getLastRowNum(); i++) {
		
		Row r = s.getRow(i);
		
		Cell c = r.getCell(0);
		
		String username=c.toString();
		
		Cell c1=r.getCell(1);
		String pass=c1.toString();
		
		System.out.println(username);
	 	System.out.println(pass);

}
	
	}
}
