package com.store.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;

import com.store.entity.Store;
import com.store.repository.StoreRepo;

import antlr.collections.List;

@Service
public class StoreService {

	@Autowired
	StoreRepo repo;

	@LoadBalanced
	public Optional<Store> getStoreDetails(int id) {
		Optional<Store> store = repo.findById(id);
		System.out.println(store);
		return store;
	}

	@LoadBalanced
	public List getStores(int pinCode) {

		List resturants = repo.getClass(pinCode);

		return resturants;

	}

}
