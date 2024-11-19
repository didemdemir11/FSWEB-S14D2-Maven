package org.example;
import org.example.model.*;
import org.example.model.enums.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4= new Wall("West");
        Wall wall5= new Wall("");
        Ceiling ceiling = new Ceiling(10, PaintColor.RED);
        Bed bed = new Bed("Modern",4,20,3,2);
        Lamp lamp = new Lamp(LampType.LAVA,true,75);
        Wardrobe wardrobe = new Wardrobe(120,200,80.5);
        Carpet carpet = new Carpet(2,3,PaintColor.RED);
        Bedroom bedroom= new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4,wall5, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println("Bedroom Name: " + bedroom.getName());
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWardrobe().add();
    }
}