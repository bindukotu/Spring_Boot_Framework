package com.faang.bindu.runnner;

import com.faang.bindu.entity.Employee_details;
import com.faang.bindu.repo.Emp_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpRunner implements CommandLineRunner {
    @Autowired
    Emp_Repo repo;

    @Override
    public void run(String... strings) throws Exception {

        Employee_details emp=new Employee_details(1,"bindu","programer");
        repo.save(emp);
        System.out.println("Record inserted : ");
    }


}
