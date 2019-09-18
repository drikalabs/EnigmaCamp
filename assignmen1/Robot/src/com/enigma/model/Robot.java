package com.enigma.model;
public class Robot {
    private Integer posX;
    private Integer posY;
    Direction Direction;
    private final String TURNRIGHT = "R";
    private final String TURNLEFT = "L";
    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private char[] commands;
    public Robot(Integer x, Integer y, Direction dir) {
        this.posX = x;
        this.posY = y;
        this.Direction = dir;
    }
    public void turnRighr() {this.Direction =this.Direction.turnRight();}
    public void turnLeft() {this.Direction =this.Direction.turnLeft(); }
    public void FORWARD(){
        if (Direction.equals(Direction.NORT)) {
            this.posY++;
        } else if (Direction.equals(Direction.EAST)) {
            this.posX++;
        } else if (Direction.equals(Direction.SOUTH)) {
            this.posY--;
        } else if (Direction.equals(Direction.WEST)) {
            this.posX--;
        } else {
            System.out.println("Wrong Direction !!");
        }
    }
    public void BACKWARD(){
        if (Direction.equals(Direction.NORT)) {
            this.posY++;
        } else if (Direction.equals(Direction.EAST)) {
            this.posX++;
        } else if (Direction.equals(Direction.SOUTH)) {
            this.posY--;
        } else if (Direction.equals(Direction.WEST)) {
            this.posX--;
        } else {
            System.out.println("Wrong Direction !!");
        }
    }
    private void move(String movement) {
        if (movement.equals(TURNRIGHT)){
            turnRighr();
        }else if (movement.equals(TURNLEFT)){
            turnLeft();
        }else if(movement.equals(FORWARD)){
            FORWARD();
        }else if(movement.equals(BACKWARD)){
            BACKWARD();
        }
    }
    public void setCommands(String commands) {this.commands = commands.toUpperCase().toCharArray(); }
    public void Run() {
        for (int i = 0; i < this.commands.length; i++) {
            move(String.valueOf(this.commands[i]));
            System.out.println(getPosition());
        }
    }
    private String getPosition() {return "(" + this.posX + "," + this.posY + ") Direction :"+this.Direction+""; }
}


