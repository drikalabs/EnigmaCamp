package com.enigma.model;

public class Triangle extends Shape {
    private  Integer base;
    private  Integer height;

    public Triangle(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }
    public Double getSurface(){
        return 0.5*this.base*this.height;
    }
}
