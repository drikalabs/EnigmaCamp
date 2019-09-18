package com.enigma.model;

public class Tower implements HitAble{
    Integer hp;
    public Tower(Integer hp){this.hp =hp;}

    @Override
    public void getHit(Integer damage) {
        this.hp = this.hp-damage;
    }
    public String print() {
        return "Tower{" +
                "hp=" + hp +
                '}';
    }
}
