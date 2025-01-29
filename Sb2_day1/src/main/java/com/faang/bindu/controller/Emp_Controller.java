package com.faang.bindu.controller;

import com.faang.bindu.entity.Emp_Data;
import com.faang.bindu.service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Emp_Controller {
    @Autowired
    Emp_Service ser;

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  String insertRecord(@RequestBody Emp_Data emp){
        return ser.insertRecord(emp);
    }

    @PostMapping("/insertvalue")
    public String insertAllRecords(@RequestBody List<Emp_Data> emp){
        return ser.insertAllRecord(emp);
    }

    @PutMapping("/update")
    public String updateRecord(@RequestBody Emp_Data emp){
       return ser.updateRecord(emp);
    }

    @GetMapping("/getdata")
    public Iterable<Emp_Data> getAllRecords()
    {
        return ser.getAllRecords();
    }

    @GetMapping("/{id}")
    public Optional<Emp_Data> getRecordById(@PathVariable Integer id){
        return ser.getRecordById(id);
    }

    @DeleteMapping("/{id}")
    public String recordDeleteById(@PathVariable Integer id){
        return ser.recordDeleteById(id);
    }

    @DeleteMapping("/deleteall")
    public String toDeleteAllRecords(){
        return ser.toDeleteAllRecords();
    }
}
