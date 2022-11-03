package Visitor_Liquor;

interface Visitor {
    //Visitor
    public double visit(Liquor liquorItem);

    public double visit(Tobacco tobaccoItem);

    public double visit(Necessity necessityItem);
}
