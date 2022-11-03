package Prototype_Shape.Prototype;

import Prototype_Shape.Shape;

public class Square extends Shape {
    //ConcretePrototype
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
