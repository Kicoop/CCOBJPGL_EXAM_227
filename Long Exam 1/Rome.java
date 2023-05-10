public class Rome implements Locations {
    
    int airFare = 110;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
}
}