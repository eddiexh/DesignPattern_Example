package Mediator_Purchase.ConcreteColleague;

import Mediator_Purchase.Mediator;

public class Exit{
    //Concrete Colleague
    Mediator mediator;

    public Exit(Mediator m){
        mediator = m;
    }

    public void go(){
        System.out.println("Please come again sometime.");
    }
}