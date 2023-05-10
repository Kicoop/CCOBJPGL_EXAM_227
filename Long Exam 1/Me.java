public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        checkBudget();
        if (budget < boracay.airFare) {
            System.out.println("Sayang, pang inom ko nalang siguro toh");

        } else {
            budget = budget - boracay.airFare;
            System.out.println("Hello Boracay! Inuman na!");        
        } checkBudget();
    }
    public void visit(Bali bali) {
        if (budget < bali.airFare) {
         System.out.println("Sayang, pang inom ko nalang siguro toh");
         } else {budget = budget - bali.airFare;
         System.out.println("Nice Bali! Inom na me!");
         } checkBudget();
    }
    public void visit(Dubai dubai) {
        if (budget < dubai.airFare) {
            System.out.println("Sayang, pang inom ko nalang siguro toh");
           
         } else { 
            budget = budget - dubai.airFare;
            System.out.println("Hello Dubai! Inom para sira atay!");
         } checkBudget();
    }
    public void visit(Paris paris) {
        
        if (budget < paris.airFare) {
            System.out.println("Sayang, pang inom ko nalang siguro toh");
         } else {
            budget = budget - paris.airFare;
            System.out.println("Bounjour Paris, iinom nanaman si Francis");
         } checkBudget();
    }
    public void visit(Rome rome) {
       
        if (budget < rome.airFare) {
            System.out.println("Sayang, pang inom ko nalang siguro toh");
         } else {
            budget = budget - rome.airFare;
            System.out.println("Hello Rome! Wala bang rum dito?");
         } checkBudget();
    }
    public void visit(Vancouver vancouver) {
        if (budget < vancouver.airFare) {
            System.out.println("Sayang, pang inom ko nalang siguro toh");
         } else {
            budget = budget - vancouver.airFare;
            System.out.println("Dream city! Tara inom na!");
         } checkBudget();
    }

    public void checkBudget() {
        System.out.println("My budget is "+ budget);
    }

}