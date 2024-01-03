package com.localbizconnect.repository;

import com.localbizconnect.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    Business findByEmail(String email);
}
