package com.enigma.model;

public class RoleType extends MobaHero {
    private final Double magigDamage =20.0;//mage spesiality
    private final Double criticalDamage =35.0;// assassin spesiality
    private final Double physicalDamage =20.0;//fighter spesiality
    private final Double armor=10.0;//Tank spesiality
    private String role;
    private final String M="MAGE";
    private final String A="ASSASSIN";
    private final String F="FIGHTER";
    private final String T="TANK";



    public RoleType(Double HP, Double Mana,Double basicDamage,Double basicDefends, String heroName,String role){
     super(HP,Mana,basicDamage,basicDefends,heroName);
     this.role =role.toUpperCase();
        if (this.role.equals(M)){
            this.basicDamage =this.basicDamage+this.magigDamage;
        }else if(this.role.equals(A)){
            this.basicDamage =this.basicDamage+this.criticalDamage;
        }else if(this.role.equals(F)){
            this.basicDamage =this.basicDamage+this.physicalDamage;
        }else if(role.toUpperCase().equals(T)){
            this.basicDamage =this.basicDefends+this.armor;
        }


    }


    public void showStatuslv1() {
        System.out.println("Stats Hero On level : 1");
        System.out.println("|Heroes Name :"+this.heroName+"|");
        System.out.println("|Heroes Role :"+this.role+"|");
        System.out.println("|Heroes Health Point :"+this.HP+"|");
        System.out.println("|Heroes Mana Point :"+this.Mana+"|");
        System.out.println("|Heroes Basic Damage :"+this.basicDamage+"|");
        System.out.println("|Heroes Basic Deffends :"+this.basicDefends+"|");
    }
    public void doSimulation(){
        for(int l=2 ;l<=this.maxlevel;l++){
            System.out.println("Stats Hero On level :"+l);
            Double getValueHp =this.HP*this.growth;
            Double getValueMp =this.Mana*this.growth;
            Double getValuePd =this.basicDamage*this.growth;
            Double getValuePdef =this.basicDefends*this.growth;
            this.HP= this.HP+getValueHp;
            this.Mana= this.Mana+getValueMp;
            this.basicDamage= this.basicDamage+getValuePd;
            this.basicDefends= this.basicDefends+getValuePdef;
            System.out.println("|Heroes Name :"+this.heroName+"|");
            System.out.println("|Heroes Role :"+this.role+"|");
            System.out.println("|Heroes Health Point :"+this.HP+"|");
            System.out.println("|Heroes Mana Point :"+this.Mana+"|");
            System.out.println("|Heroes Basic Damage :"+this.basicDamage+"|");
            System.out.println("|Heroes Basic Deffends :"+this.basicDefends+"|");

        }
    }
}
