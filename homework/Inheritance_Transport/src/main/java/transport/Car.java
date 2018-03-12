package transport;

public class Car extends PassengerTransport {

    private String trafficLight = "red";
    public Construction construction;

    public Car(double weight){
        super("road", 4, 4, weight);
    }

    public Car(Construction construction, double weight){
        super("road", 4, 4, weight);
        this.construction = construction;
    }


    public void setTrafficLight(String trafficLight) {
        this.trafficLight = trafficLight;
    }

    public String getTrafficLight() {
        return trafficLight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight='" + this.getWeight() + '\'' +
                ", construction=" + construction +
                '}';
    }

    @Override
    public void checkWay() {
        switch (trafficLight) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("Prepare to go");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Something strange. Be careful.");
                break;
        }
    }

    @Override
    public String getName() {
        return "car";
    }
}
