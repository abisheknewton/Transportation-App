package com.ahasan.item.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahasan.item.common.exceptions.RecordNotFoundException;
import com.ahasan.item.common.messages.BaseResponse;
import com.ahasan.item.common.messages.CustomMessage;
import com.ahasan.item.common.utils.Topic;
import com.ahasan.item.entity.WishListEntity;
import com.ahasan.item.repo.WishListRepo;

@RestController
public class WishListController {

	@Autowired
	private WishListRepo wishListRepo;

	@GetMapping(value = "/wish-find/{id}")
	public ResponseEntity<List<WishListEntity>> getAllWishList(@PathVariable String id) {
		List<WishListEntity> list = wishListRepo.findByUserId(id);

		return new ResponseEntity<List<WishListEntity>>(list, HttpStatus.OK);
	}

	@PostMapping("/wish-save")
	public ResponseEntity<BaseResponse> createOrUpdateItem(@Valid @RequestBody WishListEntity WishListEntity) {
		wishListRepo.save(WishListEntity);
		BaseResponse base = new BaseResponse(Topic.Item.getName() + CustomMessage.SAVE_SUCCESS_MESSAGE,
				HttpStatus.CREATED.value());
		return new ResponseEntity<>(base, HttpStatus.OK);
	}

	@PutMapping("/wish-update")
	public ResponseEntity<BaseResponse> updateItem(@Valid @RequestBody WishListEntity WishListEntity) {
		wishListRepo.save(WishListEntity);
		BaseResponse base = new BaseResponse(Topic.Item.getName() + CustomMessage.SAVE_SUCCESS_MESSAGE,
				HttpStatus.CREATED.value());
		return new ResponseEntity<>(base, HttpStatus.OK);
	}
	

	@DeleteMapping(value = "/wish-delete/{itemId}")
	public ResponseEntity<BaseResponse> deleteItemById(@PathVariable("itemId") String itemId) {

		Optional<WishListEntity> wish=wishListRepo.findById(itemId);
		if (wish.isPresent()) {
			wishListRepo.deleteById(itemId);
		} else {
			throw new RecordNotFoundException("No record found for given id: " + itemId);
		}
		BaseResponse base= new BaseResponse(Topic.Item.getName() + CustomMessage.DELETE_SUCCESS_MESSAGE, HttpStatus.OK.value());

		return new ResponseEntity<>(base, HttpStatus.OK);
	}
	
}
