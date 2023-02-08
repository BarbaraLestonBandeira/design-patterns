package comportamentais.chainOfResponsability;

public class Bus extends Vehicle {


    @Override
    public void handleRequest(String request) {
        if (request.equals("Bus")) {
            System.out.println("A processar o pedido para Bus. Aqui temos trabalho para fazer.");
        } else {
            System.out.println("Pedido não processado por Bus. Vamos mandar para o próximo handler.");
            if (nextVehicle != null) {
                nextVehicle.handleRequest(request);
            }
        }
    }
}
