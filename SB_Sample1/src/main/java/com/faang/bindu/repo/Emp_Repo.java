package com.faang.bindu.repo;

import com.faang.bindu.entity.Employee_details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emp_Repo extends CrudRepository<Employee_details,Integer> {
}
