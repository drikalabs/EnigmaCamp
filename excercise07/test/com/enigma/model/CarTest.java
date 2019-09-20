package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void assertTrue_when_LicencePlate_equals_B9839SPZ(){
        String licensePlate="B 9839 SPZ";
        Integer timeEntry=7;
        Car carTest =new Car(licensePlate,timeEntry);
        assertEquals(licensePlate,carTest.getLicensePlate());
    }
    @Test
    public void assertFlse_when_LicencePlate_equals_B1234QBZ_filled_with_B9839SPZ(){
        String licensePlate="B 9839 SPZ";
        String wrongLicensePlate="B 1234 QBZ";
        Integer timeEntry=7;
        Car carTest =new Car(licensePlate,timeEntry);
        assertFalse(carTest.getLicensePlate().equals(wrongLicensePlate));
    }

}