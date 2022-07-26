package com.ImportExcel.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.ImportExcel.Model.Model;
import com.ImportExcel.service.ExcelService;


public class ExcelHelper {
	   public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	   static String[] HEADERs = { "Title","UserId","description","Mobile","published"};
	   public static List<Model> excelToTutorials(InputStream is) {
	    try {
	      Workbook workbook = new XSSFWorkbook(is);
          Sheet sheet = workbook.getSheetAt(0);
          Iterator<Row> rows = sheet.iterator();
          List<Model> tutorials = new ArrayList<Model>();
          int rowNumber = 0;
          while (rows.hasNext()) {
            Row currentRow = rows.next();
            // skip header
            if (rowNumber == 0) {
              rowNumber++;
              continue;
            }

            Iterator<Cell> cellsInRow = currentRow.iterator();

            Model model = new Model();

            int cellIdx = 0;
            while (cellsInRow.hasNext()) {
              Cell currentCell = cellsInRow.next();

              
              switch (cellIdx) {
              

              case 0:
                model.setTitle(currentCell.getStringCellValue());
                break;
                
              case 1:
            	  model.setUserId(Long.valueOf(currentCell.getStringCellValue()));
                  break;
                  
              case 2:
                model.setDescription(currentCell.getStringCellValue());
                break;

              case 3:
                  model.setMobile((long)currentCell.getNumericCellValue());
                  break;
             
              case 4:
                model.setPublished(currentCell.getBooleanCellValue());
                break;
                
                  
              default:
                break;
              }

              cellIdx++;
            }

            tutorials.add(model);
          }

          workbook.close();

	      return tutorials;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	    }
	  }
	  
	  public static boolean hasExcelFormat(MultipartFile file) {

		    if (!TYPE.equals(file.getContentType())) {
		      return false;
		    }

		    return true;
		  }
	}


