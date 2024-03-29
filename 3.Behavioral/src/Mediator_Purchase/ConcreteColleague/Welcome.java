package Mediator_Purchase.ConcreteColleague;

import Mediator_Purchase.Mediator;

import java.io.*;

public class Welcome{
    //Concrete Colleague
    Mediator mediator;
    String response = "n";

    public Welcome(Mediator m) {
        mediator = m;
    }

    public void go(){
        System.out.print("Do you want to shop? [y/n]? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            response = reader.readLine();
        } catch (IOException e){
            System.err.println("Error");
        }

        if (response.equals("y")){
            mediator.handle("welcome.shop");
        } else {
            mediator.handle("welcome.exit");
        }
    }
}