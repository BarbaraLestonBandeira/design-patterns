package extras.objectPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    protected List<Connection> availableConnections = new ArrayList<>();
    protected List<Connection> inUseConnections = new ArrayList<>();

    public ConnectionPool() {
        //inicializar a pool com um número fixo de connections
        for (int i = 0; i < 10; i++) {
            availableConnections.add(new Connection("localhost", String.format("user%d", i+1), "password"));
        }
    }
    public Connection getConnection() {
        if(!availableConnections.isEmpty()) {
            Connection connection = availableConnections.remove(0);
            inUseConnections.add(connection);
            return connection;
        }
        throw new RuntimeException("Não há connections disponíveis!");
    }

    public void releaseConnection(Connection connection) {
        inUseConnections.remove(connection);
        availableConnections.add(connection);
        connection.reset();
    }
}
