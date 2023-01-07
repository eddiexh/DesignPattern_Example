package Prototype_Shape.ConcretePrototype;

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
