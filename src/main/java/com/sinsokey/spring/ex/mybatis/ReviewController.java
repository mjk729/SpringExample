package com.sinsokey.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinsokey.spring.ex.mybatis.domain.Review;
import com.sinsokey.spring.ex.mybatis.service.ReviewService;

@RequestMapping("/mybatis")
@Controller
public class ReviewController {
	
	
	@Autowired
	private ReviewService reviewService;
	
	// id가 3인 review 데이터 조회
	
	@RequestMapping("/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		Review review = reviewService.getReview(id);
		return review;
	}

	// 새로운 리뷰를 등록하는 기능
	@RequestMapping("/ex02")
	@ResponseBody
	public String createReview() {
		// 4, 콤비네이션 피자, 김민중, 4.5, 할인도 많이 받고 잘 먹었음.
//		int count = reviewService.addReview(4, "콤비네이션 피자", "김민중", 4.5, "할인도 많이 받고 잘 먹었음");
		
		// 2, 뿌링클, 김민중, 4.0, 역시 뿌링클은 진리 입니다.
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("김민중");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리 입니다.");
		
		int count = reviewService.addReviewByObject(review);
		
		return "삽입 개수 : " + count;
	}
	
}
