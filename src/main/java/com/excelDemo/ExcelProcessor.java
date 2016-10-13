package com.excelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProcessor {
	
	//static String outSingleRowBean = null;
	//static List<String> outSingleExcelBeanList = new ArrayList<String>();
	//List<List<HashMap<String, String>>> outAllExcels = new ArrayList<List<HashMap<String,String>>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream inputStream = null;
		//List<ExcelModelBean> excelBeanList = new ArrayList<ExcelModelBean>();
				
		/*try {
			excelBeanList = excelBeanListObjFactory();
				
			FileUtils.copyFile(new File(ExcelConstants.SRCFILE), new File(ExcelConstants.DESTFILE));
			
			//
			
			 FileInputStream input_document = new FileInputStream(new File(ExcelConstants.DESTFILE));
             
             XSSFWorkbook wb = new XSSFWorkbook(input_document); 
             
             XSSFSheet worksheet = wb.getSheetAt(0);
             
             XSSFCell cell = null; 
             
             cell = worksheet.getRow(0).createCell(3);
             cell.setCellType(Cell.CELL_TYPE_STRING);
             cell.setCellValue("Status");
             
             System.out.println(worksheet.getRow(0).getCell(3));
             
             for(int i = 1;i < 3;i++){
         		
 				XSSFRow row = worksheet.getRow(i);
 				row.createCell(3);
 				row.getCell(3).setCellValue("S");
             }
             
             input_document.close();
             
             FileOutputStream output_file =new FileOutputStream(new File(ExcelConstants.DESTFILE));
             
             wb.write(output_file);
             
             output_file.close();         
			
				System.out.println("COMPLETE"); 
				
				for (String outSingle : outSingleExcelBeanList) {
					System.out.println(outSingle);
				}
			
		} catch (Exception ex) {
			
			System.out.println(ex.fillInStackTrace());
			
		} finally {

			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
*/
	/*private static List<ExcelModelBean> excelBeanListObjFactory() throws FileNotFoundException, IOException {
		FileInputStream inputStream;
		String excelFilePath = ExcelConstants.EXCELFILEPATH;
		inputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		
		 ExcelModelBean inExcelSingleRowBean = new ExcelModelBean();
		 List<ExcelModelBean> inSingleExcelBeanList = new ArrayList<ExcelModelBean>();
		//List<List<ExcelModelBean>> inAllExcelListBean = new ArrayList<List<ExcelModelBean>>();
		
			for(int i = 1;i < 3;i++){
		
				Row row = firstSheet.getRow(i);
				
				inExcelSingleRowBean.setfName(row.getCell(0).toString());
				inExcelSingleRowBean.setlName(row.getCell(1).toString());
				inExcelSingleRowBean.settShirt(row.getCell(2).toString());
				
				outSingleRowBean = row.getCell(0).toString()+row.getCell(1).toString()+row.getCell(2).toString();
				
				inSingleExcelBeanList.add(inExcelSingleRowBean);
				outSingleExcelBeanList.add(outSingleRowBean);
				
			}
		return inSingleExcelBeanList;
	}*/
		
		//
		File folder = null;
		File[] listOfFiles=null;
		
		folder = new File("E:\\shreyas\\ExcelDemo\\in");
		if(folder != null){
			listOfFiles = folder.listFiles();
		}
		    if (listOfFiles != null) {
				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile()) {
						System.out.println("File " + listOfFiles[i].getName());
					} else if (listOfFiles[i].isDirectory()) {
						System.out.println("Directory "+ listOfFiles[i].getName());
					}
				}
				//
			}
	}
}
