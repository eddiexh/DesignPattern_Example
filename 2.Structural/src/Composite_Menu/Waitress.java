package Composite_Menu;

import java.util.Iterator;

public class Waitress {
    //Leaf
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
