package com.ashwin.accessingdatamysql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.repository.CrudRepository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface studentRepository extends JpaRepository<student, Integer> {
	
List<student> findAllBystdid(Integer stdid);
}