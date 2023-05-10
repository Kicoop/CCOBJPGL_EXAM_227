interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bali bali);
    void visit(Boracay boracay);
    void visit(Dubai dubai);
    void visit(Paris paris);
    void visit(Rome rome);
    void visit(Vancouver vancouver);

    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}