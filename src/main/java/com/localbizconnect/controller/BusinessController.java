package com.localbizconnect.controller;

import com.localbizconnect.model.Business;
import com.localbizconnect.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/business")
    public String registerOrUpdateBusiness(@RequestBody Business business) {
//        return businessService.saveOrUpdateBusiness(business);
         businessService.saveOrUpdateBusiness();
         return "";
    }

    // Other endpoints...
}
