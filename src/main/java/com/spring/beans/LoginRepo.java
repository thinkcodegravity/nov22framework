package com.spring.beans;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.springdata.UsersEntity;

@Repository
public interface LoginRepo extends JpaRepository<UsersEntity, String> {
	public List<UsersEntity> findByUidAndPwd(String users,String password);
}