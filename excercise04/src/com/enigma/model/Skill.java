package com.enigma.model;
public class Skill{
  private   Integer manacost;
  private   Integer skilldamage;
  private   String skilname;

    public Skill(String skilname,Integer skilldamage,Integer manacost) {
        this.skilname =skilname;
        this.skilldamage =skilldamage;
        this.manacost =manacost;
    }
    public void castSkill(Affected affected){ affected.getSkilled(affected,this.skilldamage);}
    public void decreaseMana(Heroes heroes){
        heroes.decreaseMana(this.manacost);
        }


}


