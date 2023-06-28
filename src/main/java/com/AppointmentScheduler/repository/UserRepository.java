package com.AppointmentScheduler.repository;

import com.AppointmentScheduler.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Appointment, Long> {



}
