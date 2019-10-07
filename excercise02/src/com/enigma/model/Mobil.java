package com.enigma.model;

public class Mobil {
    private Boolean isStart;
    private Integer fuel =0;

    public void fillFuel(int fuel) {
        this.fuel = this.fuel + fuel ;
    }
    public String engineStart() {
        if (this.fuel > 0) {
            isStart = true;
            return "ngeng ngeng";
        }
        return "fail";
    }

    public String engineStop() {
        isStart = false;
        return"stop";
    }

    public void parking() {
        System.out.println("park");
        if (isStart){
            System.out.println("not yet");
            return;
        }

    }
    public String cettak() {
        return "Mobil{" +
                "isStart=" + isStart +
                ", fuel=" + fuel +
                '}';
    }
}
