package com.sinsokey.spring.ex.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jstl")
@Controller
public class JSTLController {

	@GetMapping("/ex01")
	public String ex01() {
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("딸기");
		fruitList.add("수박");
		fruitList.add("망고");
		fruitList.add("체리");
		
		model.addAttribute("fruitList", fruitList);
		
		// 사용자 정보 리스트
		// 사용자 정보 : 이름, 나이, 취미....
		
		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("name", "김민중");
		user1.put("age", 22);
		user1.put("hobby", "game");
		userList.add(user1);
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("name", "홍길동");
		user2.put("age", 18);
		user2.put("hobby", "약탈");
		userList.add(user2);
		
		model.addAttribute("userList",userList);
		
		
		return "jstl/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date date = new Date();
		model.addAttribute("now",date);
		
		String dateString = "2023/07/14 20:53:12";
		model.addAttribute("dateString", dateString);
		
		return "jstl/ex03";
	}
	
	
	
}
