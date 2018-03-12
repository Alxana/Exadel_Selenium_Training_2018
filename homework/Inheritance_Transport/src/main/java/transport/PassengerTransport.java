package transport;

import java.util.Objects;

public abstract class PassengerTransport implements Transport {


    private String way; //road, rails, air
    private int passNum; // max number of passengers
    private int wheelNum;
    private double weight;
//    protected boolean isPublic; //not personal auto or taxi
//    protected boolean isFree;
    protected boolean isCity; // only in cities

    PassengerTransport(String way, int wheels, int passengers, double weight) {
         this.way = way;
         this.wheelNum = wheels;
         this.passNum = passengers;
         this.weight = weight;
    }

    public int getPassNum() {return passNum;}
    public String getWay() {return way;}
    public double getWeight(){return weight;}

    // check if transport can go (green light, no pedestrians...)
    public abstract void checkWay();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerTransport that = (PassengerTransport) o;
        return passNum == that.passNum &&
                wheelNum == that.wheelNum &&
                Double.compare(that.weight, weight) == 0 &&
                Objects.equals(way, that.way);
    }

    @Override
    public int hashCode() {
        return Objects.hash(way, passNum, wheelNum, weight);
    }
}
