package com.example.demo;

import com.example.demo.client.StoreApi;
import com.example.demo.domain.Store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {


    @Autowired
    private StoreApi storeApi;


    @RequestMapping(value = "/{storeId}")
    public ResponseEntity<?> storeInfo(){
        Store store = storeApi.getStore();
        return new ResponseEntity<>(store,HttpStatus.OK);

    }
    

    @RequestMapping(value = "/{pinCode}")
    public ResponseEntity<?> allStoreInfo(){
        Store store = storeApi.getAllStore();
        return new ResponseEntity<>(store,HttpStatus.OK);

    }
}
