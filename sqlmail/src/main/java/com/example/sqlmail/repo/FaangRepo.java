package com.example.sqlmail.repo;

import com.example.sqlmail.entity.FaangEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaangRepo extends CrudRepository<FaangEntity,Integer> {
    public List<FaangEntity> findByDesignation(String designation);
}
