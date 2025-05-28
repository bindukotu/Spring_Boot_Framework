package com.example.apimail.controll;


import com.example.apimail.entity.EmailEntity;
import com.example.apimail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
@Autowired
    private EmailService es;
@PostMapping(value="/api/email")
    public ResponseEntity<String> sendMail(@RequestBody EmailEntity req){
         try{
              es.send(req);
              return ResponseEntity.ok("Email send sucessfully");
         }
         catch(Exception e){
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("error sending mail "+e.getMessage());
         }
}

}
