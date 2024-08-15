package com.ahasan.item.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ahasan.item.entity.WishListEntity;

public interface WishListRepo extends MongoRepository<WishListEntity, String>{

	@Query("{ 'userId' : ?0 }")
	List<WishListEntity> findByUserId(String user);
}
