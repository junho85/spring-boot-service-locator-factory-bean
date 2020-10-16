package kr.pe.junho85.demo.controller;

import kr.pe.junho85.demo.model.Vehicle;
import kr.pe.junho85.demo.registry.ServiceRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final ServiceRegistry serviceRegistry;

    @PostMapping
    public void processStudentDetails(@RequestBody Vehicle vehicle) {
        serviceRegistry.getService(vehicle.getVehicleType()).process(vehicle);
    }
}
