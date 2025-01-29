package com.faang.bindu.runner;

import com.faang.bindu.entity.Emp_Details;
import com.faang.bindu.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmpRunner  implements CommandLineRunner {
    @Autowired
    EmpRepo repo;
    @Override
    public void run(String... args) throws Exception {
       repo.deleteAll();
//        repo.deleteById((Integer) 1);
//        System.out.println("deleted : ");
//        for (Emp_Details empDetails : repo.findAll()) {
//            System.out.println("id :"+empDetails.getId()+" name : "+empDetails.getName()+" loc: "+empDetails.getLoc());
//        }


//       Optional<Emp_Details> c= repo.findById((Integer) 2);
//        System.out.println("id : "+c.get().getId()+" name : "+c.get().getName()+" loc : "+c.get().getLoc());
//        Emp_Details emp=new Emp_Details(3,"v","guntur");
//        repo.save(emp);
//        System.out.println("insert file");
    }
}
