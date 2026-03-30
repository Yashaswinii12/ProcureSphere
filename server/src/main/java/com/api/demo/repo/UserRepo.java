package com.api.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
	

}
