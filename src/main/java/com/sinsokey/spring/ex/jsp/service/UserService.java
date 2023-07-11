package com.sinsokey.spring.ex.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinsokey.spring.ex.jsp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// 사용자 정보를 전달 받고 저장하는 기능
	public int addUser(String name
			, String birthday
			, String email
			, String introduce) {
		
		int count = userRepository.insertUser(name, birthday, email, introduce);
		return count;
	}
	
}
