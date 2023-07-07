package com.sinsokey.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinsokey.spring.ex.mybatis.domain.Review;
import com.sinsokey.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	//id가 3인 리뷰 데이터 얻기
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
		return review;
	}
}
