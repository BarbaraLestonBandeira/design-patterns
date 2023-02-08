package extras.objectPool;

public class Connection implements PooledObject {

    private String url;
    private String username;
    private String password;

    public Connection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public void reset() {
        url = null;
        username = null;
        password = null;
    }
}
