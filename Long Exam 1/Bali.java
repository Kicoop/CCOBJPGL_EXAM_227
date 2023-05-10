public class Bali implements Locations{
    
    int airFare = 80;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
}
}