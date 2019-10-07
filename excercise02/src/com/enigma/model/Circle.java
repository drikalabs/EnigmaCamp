package com.enigma.model;

public class Circle {
    // atribut
    public  Integer r;
    private final Double pi =3.14;

    //method
    public Double getSurface(){
        Double surface = pi*r*r;
        return surface;
    }

    public Double getRound(){
        Double surface = pi*r*2;
        return surface;
    }

    public  Double getHalfSurface(){
        return getSurface()/2;
    }
    public  Double getHalfRound(){
        return getRound()/2;
    }


    public String Print() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                ", surface ="+getSurface()+
                ", round ="+getRound()+
                ", 1/2surface ="+getHalfSurface()+
                ", 1/2round ="+getHalfRound()+
                '}';
    }
}
