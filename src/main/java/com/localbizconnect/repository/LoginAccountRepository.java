package com.localbizconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localbizconnect.model.LoginAccount;

public interface LoginAccountRepository extends JpaRepository<LoginAccount, Long> {
	LoginAccount findByEmail(String email);
}
