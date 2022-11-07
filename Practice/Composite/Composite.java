package Composite;
import java.util.*;

class Composite implements Component{
    private List<Component> children = new ArrayList<Component>();

    public void addComponent(Component c){
        children.add(c);
    }

    public void removeComponent(Component c){
        children.remove(c);
    }

    public void execute(){
        for(Component kid:children){
            kid.execute();
        }
    }
}
