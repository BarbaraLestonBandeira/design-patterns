package comportamentais.chainOfResponsability;

public class Helicopter extends Vehicle {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Helicopter")) {
            System.out.println("A processar o pedido para Helicopter. Aqui temos trabalho para fazer.");
        } else {
            System.out.println("Pedido não processado por Helicopter. Vamos mandar para o próximo handler.");
            if (nextVehicle != null) {
                nextVehicle.handleRequest(request);
            }
        }
    }
}
