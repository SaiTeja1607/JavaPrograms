package PracticeJavaPrograms.JavaPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EditAndSaveExcelFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\target\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		XSSFRow firstRow = sheet1.getRow(0);
		int numOfCells = firstRow.getLastCellNum();
		int userNameColNum = 0;
		int pwdColNum = 0;
		for (int i = 0; i < numOfCells; i++) {
			String cellValue = firstRow.getCell(i).getStringCellValue();
			if (cellValue.equalsIgnoreCase("Username")) {
				break;
			}
			userNameColNum++;
		}
		for (int i = 0; i < numOfCells; i++) {
			String cellValue = firstRow.getCell(i).getStringCellValue();
			if (cellValue.equalsIgnoreCase("Password")) {
				break;
			}
			pwdColNum++;
		}
		int noOfRows = sheet1.getPhysicalNumberOfRows();
		for (int i = 1; i < noOfRows; i++) {
			XSSFRow row = sheet1.getRow(i);
			String value = row.getCell(userNameColNum).getStringCellValue();
			if (value.equals("test3@test.com")) {
				row.getCell(pwdColNum).setCellValue("updated value2");
				FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\target\\TestData.xlsx");
				workbook.write(fos);
				workbook.close();
				fis.close();

			}
		}

		System.out.println("Program is complete");
	}

}
