package com.enigma.model;

public class Kendaraan {
    Direction direction;
    private  Integer posX;
    private  Integer posY;
    private  Integer fuel=0;
    private final String RIGHT = "R";
    private final String LEFT= "L";
    private final String FORWARD= "F";
    private final String BACK= "B";
    private char [] commands;

    public  Kendaraan(int x ,int y){
        this.posX =x;
        this.posY =y;
    }

    public void setFuel(int x) {
        this.fuel = this.fuel + x;
    }
    private void move(String movement){
        if (movement.equals(RIGHT)){
            this.posX++;
        }else if (movement.equals(LEFT)){
            this.posX--;
        }else if(movement.equals(FORWARD)){
            this.posY++;
        }else if(movement.equals(BACK)){
            this.posY--;
        }

    }
    public void setCommands(String commands){
        this.commands =  commands.toUpperCase().toCharArray();
    }
    public void doRun(){
        for (int i=0;i<this.commands.length;i++){
            if (this.fuel == 0){
                System.out.println("Bensin Habis di :"+getPositio());
                break;
            }

                move(String.valueOf(this.commands[i]));
                System.out.println(getPositio());
            if((i+1)%3==0){
                this.fuel--;
            }

        }
    }
    private String getPositio(){
        return "("+this.posX+","+this.posY+")";

    }

}
