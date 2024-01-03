package com.localbizconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localbizconnect.model.Business;
import com.localbizconnect.repository.BusinessRepository;

@Service
public class BusinessService {

	@Autowired
	private BusinessRepository businessRepository;

	public Business saveOrUpdateBusiness(Business business) {
		return this.businessRepository.save(business);
	}

	// Other methods...
}
