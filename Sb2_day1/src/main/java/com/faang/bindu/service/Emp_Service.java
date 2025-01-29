package com.faang.bindu.service;

import com.faang.bindu.entity.Emp_Data;
import com.faang.bindu.repo.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class Emp_Service {
    @Autowired
    Emprepo repo;
    public  String insertRecord(Emp_Data emp){
        repo.save(emp);
        return "record inserted"+emp.getId();
    }

    public String insertAllRecord(List<Emp_Data> emp){
        repo.saveAll(emp);
        return "All Records Inserted ";
    }

    public Iterable<Emp_Data> getAllRecords(){
        return repo.findAll();
    }

    public Optional<Emp_Data> getRecordById(Integer id){
        return repo.findById(id);
    }

    public String updateRecord(Emp_Data emp){
        repo.save(emp);
        return "record updated";
    }

    public String recordDeleteById(Integer id){
        repo.deleteById(id);
        return "Record Deleted ";
    }

    public String toDeleteAllRecords(){
        repo.deleteAll();
        return "All Records are Deleted";
    }

    public Emp_Data patchRecord(Integer id, Map<String,Object> map){
        Optional<Emp_Data> op=repo.findById(id);
           if(op.isPresent()){
               Emp_Data emp=op.get();
              map.forEach((key,value)->{
                  Field field= ReflectionUtils.findField(Emp_Data.class,key);
                  if(field!=null){
                         ReflectionUtils.makeAccessible(field);
                        Object v1= ReflectionUtils.getField(field,emp);
                       ReflectionUtils.setField(field,emp,value);
                  }
              });
              try{
                  repo.save(emp);
                  return emp;
              }
              catch (Exception e){
                  System.out.println("data not found"+e.getMessage());
               }
           }
           else {
               throw new RuntimeException("data not found ");
           }
           return op.get();
    }
}
