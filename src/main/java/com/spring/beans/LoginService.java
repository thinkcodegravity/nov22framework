package com.spring.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.springdata.UsersEntity;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo lr;
	public boolean checkUser(String userid,String pwd) {
		List<UsersEntity> dbRecords=lr.findByUidAndPwd(userid, pwd);
		if(dbRecords.size() > 0)
			return true;
		else
			return false;
	}
}
