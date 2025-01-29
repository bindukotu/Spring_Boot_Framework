package com.faang.bindu.repo;

import com.faang.bindu.entity.Student_Info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_Repo extends CrudRepository<Student_Info,Integer> {
}
