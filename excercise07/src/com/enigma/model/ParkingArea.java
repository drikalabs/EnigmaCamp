package com.enigma.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class ParkingArea {
    private Integer maxSpace;
    private Set<Car> carSlot=new HashSet<Car>();
    private Integer mintime;
    private Integer maxtime;

    ParkingArea(Integer maximumSlot, Integer mintime, Integer maxtime) {
        this.maxSpace=maximumSlot;this.mintime=mintime;this.maxtime=maxtime;
    }

    Integer countAvaliablespace() {
        return this.maxSpace-carSlot.size();
    }

    void entryCar(Car mycar) {
        carSlot.add(mycar);
    }
    boolean getDecision(){
        if (this.maxSpace.equals(carSlot.size())){
            return true;
        }else return carSlot.size() <= this.maxSpace;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingArea that = (ParkingArea) o;
        return Objects.equals(maxSpace, that.maxSpace) &&
                Objects.equals(carSlot, that.carSlot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpace, carSlot);
    }


    boolean checkLicense(Car mycar2) {
        return carSlot.contains(mycar2);
    }

    public void setTimeRule(Integer mintime, Integer maxtime) {
    }

    boolean checkTime(Car mycar) {
        if (mycar.getTimeEntry()<=mintime &&mycar.getTimeEntry()>=maxtime){
            return true;
        }else {return false;}
    }

    public void carOut(Car mycar2) {
        carSlot.remove(mycar2);
    }
}
