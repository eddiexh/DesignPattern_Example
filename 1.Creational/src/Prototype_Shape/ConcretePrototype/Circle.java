package Prototype_Shape.ConcretePrototype;

import Prototype_Shape.Shape;

public class Circle extends Shape {
    //ConcretePrototype
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
