package com.enigma.model;

import java.util.Objects;

class Car {
    private String platnomor;
    private Integer timeEntry;
    Car(String platnomor,Integer timeEntry) {
        this.platnomor=platnomor;this.timeEntry=timeEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(platnomor, car.platnomor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platnomor);
    }

    String getLicensePlate() {
        return this.platnomor;
    }

    public Integer getTimeEntry() {
        return this.timeEntry;
    }
}
