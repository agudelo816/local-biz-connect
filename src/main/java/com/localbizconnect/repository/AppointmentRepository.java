package com.localbizconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localbizconnect.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	List<Appointment> findByBusinessId(Long businessId);
}
