package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Custom;



@Repository
public interface Studentinterface extends JpaRepository<Custom, Integer>{

}
