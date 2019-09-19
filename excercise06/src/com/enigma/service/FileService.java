package com.enigma.service;

import java.io.FileWriter;

public class FileService {
    Integer number;
    public void weriteText(Integer text) {
        try {
            this.number=this.number +text;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
