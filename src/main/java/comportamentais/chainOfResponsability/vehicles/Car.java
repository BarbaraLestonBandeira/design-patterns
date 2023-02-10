package comportamentais.chainOfResponsability.vehicles;

public class Car extends Vehicle {


    @Override
    public void handleRequest(String request) {
        if (request.equals("Car")) {
            System.out.println("A processar o pedido para Car. Aqui temos trabalho para fazer.");
        } else {
            System.out.println("Pedido não processado por Car. Vamos mandar para o próximo handler.");
            if (nextVehicle != null) {
                nextVehicle.handleRequest(request);
            }
        }
    }
}
