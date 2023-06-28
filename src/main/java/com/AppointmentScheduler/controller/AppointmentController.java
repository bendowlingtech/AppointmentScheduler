package com.AppointmentScheduler.controller;
import com.AppointmentScheduler.service.AppointmentService;
import com.AppointmentScheduler.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.AppointmentScheduler.model.Appointment;


import java.util.List;

@RestController
@RequestMapping("api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
            return ResponseEntity.ok(appointmentService.saveAppointment(appointment));


    }



    @GetMapping
    public List getAppointments() {
        return null;
    }
}
