package creacionais.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton 1 é igual a Singleton 2?");
        System.out.println(singleton1 == singleton2);
    }
}
