package extras.objectPool;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();

        Connection connection1 = connectionPool.getConnection();
        Connection connection2 = connectionPool.getConnection();

        System.out.println("Number of available connections: " + connectionPool.availableConnections.size());
        System.out.println("Number of in-use connections: " + connectionPool.inUseConnections.size());

        connectionPool.releaseConnection(connection1);
        connectionPool.releaseConnection(connection2);

        System.out.println("Number of available connections: " + connectionPool.availableConnections.size());
        System.out.println("Number of in-use connections: " + connectionPool.inUseConnections.size());

    }
}
