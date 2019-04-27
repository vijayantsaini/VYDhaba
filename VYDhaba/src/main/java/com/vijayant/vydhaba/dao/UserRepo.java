package com.vijayant.vydhaba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijayant.vydhaba.dao.entity.User;

public interface UserRepo extends JpaRepository<User, String>
{
	User findByUserId(String userId);

}
