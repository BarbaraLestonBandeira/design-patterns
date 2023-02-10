package comportamentais.chainOfResponsability.vehicles;

public class Bike extends Vehicle {


    @Override
    public void handleRequest(String request) {
        if (request.equals("Bike")) {
            System.out.println("A processar o pedido para Bike. Aqui temos trabalho para fazer.");
        } else {
            System.out.println("Pedido não processado por Bike. Vamos mandar para o próximo handler.");
            if (nextVehicle != null) {
                nextVehicle.handleRequest(request);
            }
        }
    }
}
