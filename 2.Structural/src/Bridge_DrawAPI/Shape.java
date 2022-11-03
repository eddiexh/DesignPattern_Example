package Bridge_DrawAPI;

public abstract class Shape {
    //Abstraction
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
