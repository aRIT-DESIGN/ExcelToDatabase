package com.ImportExcel.service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;


import com.ImportExcel.Model.Model;
import com.ImportExcel.Repository.MainRepository;
import com.ImportExcel.Utils.ExcelHelper;
import com.ImportExcel.fetchmodel.Fetchid;


@Service
public class ExcelService {

	  @Autowired
	  MainRepository repository;
	  public void save(MultipartFile file) {
	    try {
	      
	      List<Model> saveXl = ExcelHelper.excelToTutorials(file.getInputStream());
	      repository.saveAll(saveXl);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store excel data: " + e.getMessage());
	    }
	  }

	   
}