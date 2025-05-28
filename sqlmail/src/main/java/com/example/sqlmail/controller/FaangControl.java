package com.example.sqlmail.controller;

import com.example.sqlmail.entity.FaangEntity;
import com.example.sqlmail.service.FaangSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FaangControl {
    @Autowired
    FaangSer ser;
    @PostMapping(value="/save")
    public String FaangSave(@RequestBody FaangEntity fe){
        ser.send(fe);
        return "data added";
    }

    @GetMapping("/des")
   public ResponseEntity<String> sendMail(@RequestParam("designation") String des){
        try{
              ser.sendMail(des);
            return ResponseEntity.ok("Mail Send");
        }
        catch (Exception e){
            e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body("error sending mail"+e.getMessage());
        }
    }
}
