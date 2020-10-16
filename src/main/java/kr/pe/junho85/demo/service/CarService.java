package kr.pe.junho85.demo.service;

import kr.pe.junho85.demo.model.Vehicle;
import kr.pe.junho85.demo.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Car")
public class CarService implements AdapterService<Vehicle> {

    @Override
    public void process(Vehicle request) {
        System.out.println("inside car service - " + request.toString());
    }
}
