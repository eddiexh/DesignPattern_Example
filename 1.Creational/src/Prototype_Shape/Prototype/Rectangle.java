package Prototype_Shape.Prototype;

import Prototype_Shape.Shape;

public class Rectangle extends Shape {
    //ConcretePrototype
    public Rectangle(){
        type = "Rectangle";
    }
    
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
