package Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Custom;

@Repository
public interface Studentinterface extends JpaRepository<Custom, Integer>{

}
