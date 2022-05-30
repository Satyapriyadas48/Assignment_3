package com.store.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Store;
import com.store.service.StoreService;

import antlr.collections.List;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreService service;

	@GetMapping("/{storeId}")
	public Optional<Optional<Store>> getStore(@PathVariable int storeId) {
		return Optional.of(service.getStoreDetails(storeId));
	}

	@GetMapping("/{pinCode}")
	public Optional<List> getAllStore(@PathVariable int pinCode) {

		return Optional.of(service.getStores(pinCode));
	}

}
