package com.bng.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bng.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
