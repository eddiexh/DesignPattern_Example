package Composite;

class Leaf implements Component{
    private Type field;

    public Leaf(Type field){
        this.field = field;
    }

    public void execute(){
        //do something
    }
}
