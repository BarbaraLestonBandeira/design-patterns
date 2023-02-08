package estruturais.facade;

public class Main {

    public static void main(String[] args) {
        VehicleFacade facade = new VehicleFacade();
        System.out.println(facade.getVehicleDescription());
    }
}
