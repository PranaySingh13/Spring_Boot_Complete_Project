package com.gk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gk.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//Spring Data JPA Functionality
	User findByUserId(int id);

}
