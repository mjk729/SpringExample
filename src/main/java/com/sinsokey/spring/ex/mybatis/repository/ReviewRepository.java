package com.sinsokey.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sinsokey.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {
	
	//id가 3인 review 데이터 조회
	public Review selectReview(@Param("id") int id);
}
