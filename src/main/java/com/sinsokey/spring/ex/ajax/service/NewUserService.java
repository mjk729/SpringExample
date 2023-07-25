package com.sinsokey.spring.ex.ajax.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinsokey.spring.ex.ajax.repository.NewUserRepository;
import com.sinsokey.spring.ex.jsp.domain.User;



@Service
public class NewUserService {

	@Autowired
	private NewUserRepository newUserRepository;
	
	public List<User> getUserList() {
		List<User> userList = newUserRepository.selectUserList();
		return userList;
	}
	
	public int addUser(
			String name
			,String birthday
			,String email
			,String introduce) {
	int count = newUserRepository.insertUser(name, birthday, email, introduce);
	return count;
	}
	
	// 전달된 email이 있는지 확인하는 메소드
	public boolean isDuplicateEmail(String email) {
	int count = newUserRepository.selectCountEmail(email);
	
	if(count == 0) {
		// 중복 안됨
		return false;
	}else {
		// 중복
		return true;
	}
	}
	
}
	