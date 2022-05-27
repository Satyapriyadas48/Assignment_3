package com.example.demo.client;

import com.example.demo.domain.Store;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "storeClient" ,url = "https://localhost:8090/store")
public interface StoreApi {
    @RequestMapping(method = RequestMethod.GET)
    Store getStore();
    
    @RequestMapping(method = RequestMethod.GET)
    Store getAllStore();


}
