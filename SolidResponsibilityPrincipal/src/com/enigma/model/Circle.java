package com.enigma.model;

public class Circle extends Shape{
    private  Double radius;
    private final Double pi =3.14;

    public Circle(Double radius) {
        this.radius = radius;
    }
    public Double getSurface(){
        return this.pi*this.radius*this.radius;
    }
}
