package com.ImportExcel.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ImportExcel.Model.Model;

@Repository
public interface MainRepository extends CrudRepository<Model, Long> {

}