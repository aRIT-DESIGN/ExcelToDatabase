package com.ImportExcel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.ImportExcel.Model.ResponseMessage;
import com.ImportExcel.Utils.ExcelHelper;
import com.ImportExcel.fetchmodel.Fetchid;
import com.ImportExcel.service.ExcelService;

@RestController
@RequestMapping("/api/V1")
public class ExcelController {

	  @Autowired
	  ExcelService fileService;
	  
	  
	  @PostMapping("/uploadexcel")
	  public ResponseEntity<ResponseMessage> uploadExcel(@RequestParam("file") MultipartFile file) {
	    String message = "";
        if (ExcelHelper.hasExcelFormat(file)) {
	      try {
	    	 fileService.save(file);
             
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        System.out.println(e.getMessage());
	        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ResponseMessage(message));
	      }
	    }

	    message = "Please upload an excel file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	  }

	
}
