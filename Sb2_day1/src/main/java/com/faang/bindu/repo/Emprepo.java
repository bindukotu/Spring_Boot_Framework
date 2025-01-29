package com.faang.bindu.repo;

import com.faang.bindu.entity.Emp_Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emprepo  extends CrudRepository<Emp_Data,Integer> {
}
