package com.faang.bindu.repo;

import com.faang.bindu.entity.Emp_Details;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<Emp_Details,Integer> {

}
