public class App {
    public static void main(String[] args) throws Exception {
       
        Locations bali = new Bali();
        Locations boracay = new Boracay();
        Locations dubai = new Dubai();
        Locations paris = new Paris();
        Locations rome = new Rome();
        Locations vancouver = new Vancouver();
        
        Tourist tourist = new Me();

        bali.accept(tourist);
        boracay.accept(tourist);
        dubai.accept(tourist);
        paris.accept(tourist);
        rome.accept(tourist);
        vancouver.accept(tourist);
    }
}
