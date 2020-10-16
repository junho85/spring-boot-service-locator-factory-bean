package kr.pe.junho85.demo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;

    private String vehicleName;
    private String vehicleType;
}
