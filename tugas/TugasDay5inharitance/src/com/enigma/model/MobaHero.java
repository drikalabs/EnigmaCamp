package com.enigma.model;

public class MobaHero {
    protected Double HP;
    protected Double Mana;
    protected Double basicDamage;
    protected Double basicDefends;
    protected String heroName;
    protected final Double maxlevel=15.0;
    protected final Double growth=5.0/100.00;

    public MobaHero(Double hp, Double mana,Double basicDamage,Double basicDefends, String heroName) {
        this.HP = hp;
        this.Mana = mana;
        this.basicDamage = basicDamage;
        this.basicDefends= basicDefends;
        this.heroName = heroName;
    }
}
