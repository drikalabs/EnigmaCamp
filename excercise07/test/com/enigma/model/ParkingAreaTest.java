package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingAreaTest {
    @Test
    public void coun_available_space_should_return2_when_no_carPark(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot =2;
        ParkingArea parkingArea= new ParkingArea(maximumSlot, mintime, maxtime);
        assertEquals(maximumSlot,parkingArea.countAvaliablespace());
    }
    @Test
    public void coun_available_space_should_return2_when_no_1car_entryPark(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot=3;
        Integer expectAvaliableSpace=2;
        Car mycar=new Car("B 9950 SPZ",9);
        ParkingArea parkingArea= new ParkingArea(maximumSlot, mintime, maxtime);
        parkingArea.entryCar(mycar);
        assertEquals(expectAvaliableSpace,parkingArea.countAvaliablespace());
    }
    @Test
    public void isFullcarSloth(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot=2;
        Car mycar=new Car("B 9950 SPZ",9);
        Car mycar2=new Car("AG 9850 XYZ",11);
        ParkingArea parkingArea= new ParkingArea(maximumSlot, mintime, maxtime);
        parkingArea.entryCar(mycar);
        parkingArea.entryCar(mycar2);
        assertTrue(parkingArea.getDecision());
    }
    @Test
    public void ShouldFalse_WhenCarSlotFull_tryToParking(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot=2;
        Car mycar=new Car("B 9950 SPZ",10);
        Car mycar2=new Car("AG 9850 XYZ",11);
        ParkingArea parkingArea= new ParkingArea(maximumSlot, mintime, maxtime);
        parkingArea.entryCar(mycar);
        parkingArea.entryCar(mycar2);
        Car tryParkingCar =new Car("W 7623 BW",14);
        parkingArea.entryCar(tryParkingCar);
        assertFalse(parkingArea.getDecision());
    }
    @Test
    public void Should_true_WhenSameLicensePlat_entryParkingArea(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot=2;
        Car mycar=new Car("B 9950 SPZ",10);
        Car mycar2=new Car("B 9950 SPZ",11);
        ParkingArea parkingArea=new ParkingArea(maximumSlot, mintime, maxtime);
        parkingArea.entryCar(mycar);

    }
    @Test
    public  void ShouldFalse_whenParking_Out_of_time(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot=2;
        ParkingArea parkingArea=new ParkingArea(maximumSlot,mintime,maxtime);
        Car mycar =new Car("AG 7876 XYZ",22);
        assertFalse(parkingArea.checkTime(mycar));

    }
    @Test
    public void Should_true_Whwn_1car_out(){
        Integer mintime =7;
        Integer maxtime=21;
        Integer maximumSlot =2;
        Integer expectation=1;
        ParkingArea parkingArea= new ParkingArea(maximumSlot, mintime, maxtime);
        Car mycar=new Car("B 9950 SPZ",10);
        Car mycar2=new Car("B 9876 SPY",10);
        parkingArea.entryCar(mycar);
        parkingArea.entryCar(mycar2);
        parkingArea.carOut(mycar2);
        assertEquals(expectation,parkingArea.countAvaliablespace());
    }

}