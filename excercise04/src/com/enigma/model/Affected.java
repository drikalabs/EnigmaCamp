package com.enigma.model;

public abstract class Affected implements HitAble{


    public void getSkilled(Affected affected,Integer damage) {
    affected.getHit(damage);
    }
}
