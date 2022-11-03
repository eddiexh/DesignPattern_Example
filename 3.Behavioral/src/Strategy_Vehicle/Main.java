package Strategy_Vehicle;

import Strategy_Vehicle.Context.FormulaOne;
import Strategy_Vehicle.Context.Helicopter;
import Strategy_Vehicle.Context.Jet;
import Strategy_Vehicle.Context.StreetRacer;
import Strategy_Vehicle.Strategy.GoByDriving;
import Strategy_Vehicle.Strategy.GoByFlyingFast;

public class Main {
    public static void main(String[] args) {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();

        streetRacer.go();
        formulaOne.go();
        helicopter.go();
        jet.go();

        Jet realJet = new Jet();
        realJet.setGoAlgorithm(new GoByDriving());
        realJet.go();
        realJet.setGoAlgorithm(new GoByFlyingFast());
        realJet.go();
        realJet.setGoAlgorithm(new GoByDriving());
        realJet.go();
    }
}
