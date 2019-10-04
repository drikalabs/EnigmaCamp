package com.enigma.model;

public class Block extends Rectangle {
    private Double heihgt;

    public Block(Double length, Double width, Double heihgt) {
        super(length, width);
        this.heihgt = heihgt;
    }

    public Double getVolume(){
        return getSurface()*this.heihgt;
    }
}
