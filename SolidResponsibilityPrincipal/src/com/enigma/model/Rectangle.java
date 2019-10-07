package com.enigma.model;

public class Rectangle extends Shape{
    protected Double length;
    protected Double width;


    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }
    public Double getSurface(){
        return length*width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
