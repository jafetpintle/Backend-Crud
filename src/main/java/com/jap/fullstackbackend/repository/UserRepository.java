package com.jap.fullstackbackend.repository;


import com.jap.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
