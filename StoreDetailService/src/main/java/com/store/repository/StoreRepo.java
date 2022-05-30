package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.store.entity.Store;

import antlr.collections.List;

@Repository
public interface StoreRepo extends JpaRepository<Store , Integer> {
	@Query(value = "select * from events where pinCode in :types", nativeQuery = true)
	List getClass(int pinCode);

}
