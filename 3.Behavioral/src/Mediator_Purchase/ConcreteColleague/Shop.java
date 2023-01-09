package Mediator_Purchase.ConcreteColleague;

import Mediator_Purchase.Mediator;

import java.io.*;

public class Shop{
    //Concrete Colleague
    Mediator mediator;
    String response = "n";

    public Shop(Mediator m){
        mediator = m;
    }

    public void go(){
        System.out.print("Are you ready to purchase? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            response = reader.readLine();
        } catch (IOException e){
            System.err.println("Error");
        }

        if (response.equals("y")){
            mediator.handle("shop.purchase");
        } else {
            mediator.handle("shop.exit");
        }
    }
}