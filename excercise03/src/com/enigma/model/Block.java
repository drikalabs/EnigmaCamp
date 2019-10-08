package com.enigma.model;

public class Block extends Rectangle {
    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    public Double getVolume() {
        return this.height * this.width * this.length;
    }

    @Override
    public Double getSurface() {
        return 2 * (this.length * this.width) + 2 * (this.length * this.height) + 2 * (this.width * this.height);
    }


    public String print() {
        return "Block{ length =" + this.length +
                ",weidth =" + this.width +
                ",weidth =" + this.height +
                ",Round =" + getVolume() +
                "}";
    }
}
