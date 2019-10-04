package com.enigma.model;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    List <Shape> shapes = new ArrayList<>();


    public  void addShape(Shape shape){
        this.shapes.add(shape);
    }

    public Double sumAllShape() {

        Double total = 0.0;
        for (Shape rec : shapes) {
            total += rec.getSurface();
        }
        return total;
    }
}
