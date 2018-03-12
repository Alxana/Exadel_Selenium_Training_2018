package transport;

public interface Transport {

    //public by default
    String getName();

    //default method from java 1.8
    default void move() {
        System.out.println(getName() + " moving...");
    }

}