package com.enigma.model;

public class AssassinHeroes extends Heroes {
    public AssassinHeroes(String nama, Integer hp, Integer mana, Integer damage, Skill skill) {
        super(nama, hp, mana, damage, skill);
    }

    public String print() {
        return "AssassinHeroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", damage=" + damage +
                '}';
    }
}
