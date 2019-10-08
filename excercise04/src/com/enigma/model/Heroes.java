package com.enigma.model;

public class Heroes extends Affected implements HitAble, Offensive {
    Integer hp;
    Integer mana;
    Integer damage;
    Skill skill;

    public Heroes(String name, Integer hp, Integer mana, Integer damage, Skill skill) {
        super();
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;
        this.skill = skill;
    }

    public void attack(Heroes heroes) {
        heroes.getHit(this.damage);
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.damage);
    }

    @Override
    public void getHit(Integer damage) {
        this.hp = this.hp - damage;
    }

    public void decreaseMana(Integer manaCost) {
        this.mana = this.mana - manaCost;
    }

    public void castSkill(Affected affected) {
        skill.castSkill(affected);
        skill.decreaseMana(this);
    }

    @Override
    public void getSkilled(Affected affected, Integer damage) {
        super.getSkilled(affected, damage);
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", damage=" + damage +
                '}';
    }
}


