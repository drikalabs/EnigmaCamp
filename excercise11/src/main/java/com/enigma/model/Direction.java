package com.enigma.model;

public enum Direction {
    NORT, EAST, SOUTH, WEST;
    Direction turnRight(){return Direction.values()[(ordinal()+1)%4]; }
    Direction turnLeft(){ return Direction.values()[(ordinal()+3)%4]; }
}
