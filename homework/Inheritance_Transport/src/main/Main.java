package main;

import main.java.transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(200, 10000.0);
        plane.setFlightHeight(5000.0);

        System.out.println("----Check way for Plane----");
        plane.FlightAllowed();
        plane.checkWay();
        plane.noFlightAllowed();
        plane.checkWay();

        System.out.println("----Plane print------");
        System.out.println(plane);

        Car miniCar = new Car(600);
        Car jeep = new Car(Construction.CROSSOVER, 1100);
        Car truck = new Car(Construction.TRUCK, 5000);

        miniCar.setTrafficLight("green");
        truck.setTrafficLight("yellow");

        System.out.println("----- Check Way for cars-------");
        miniCar.checkWay();
        jeep.checkWay();
        truck.checkWay();

        jeep.setTrafficLight("blue");
        jeep.checkWay();

        System.out.println("-----Can car fly on plane as a cargo?----");
        plane.canCarGoOnPlane(miniCar);
        plane.canCarGoOnPlane(jeep);
        plane.canCarGoOnPlane(truck);

        System.out.println("-----Cars' construction-----");
        System.out.println(miniCar.construction);
        System.out.println(jeep.construction);
        System.out.println(truck.construction);

        System.out.println("---------------");
        PassengerTransport PT = new Car(Construction.valueOf("SUV"), 1500);
        Transport T = new Plane(300, 6000);

        System.out.println(PT);
        System.out.println(T);

        List<PassengerTransport> transports = new ArrayList<>();

        transports.add(miniCar);
        transports.add(jeep);
        transports.add(truck);
        transports.add(plane);
        transports.add(PT);

        System.out.println("----Print a list ----");
        System.out.println(transports);

        System.out.println("----Print list items one by one");
        for (Transport t: transports){
            System.out.println(t);
        }

        System.out.println("----Print 1 item-----");
        System.out.println(transports.get(2));

        transports.sort(new TransportComparator());

        System.out.println("-----Print sorted list-----");
        for (Transport t: transports){
            System.out.println(t);
        }

        Set<String> stringSet = new TreeSet<>();

        miniCar.construction=Construction.SEDAN;

        stringSet.add(miniCar.construction.toString());
        stringSet.add(jeep.construction.toString());
        stringSet.add(truck.construction.toString());

        System.out.println("----TreeSet print-----");
        for(String s : stringSet) {
            System.out.println(s);
        }

        Set<PassengerTransport> transportSet = new HashSet<>();

        transportSet.add(miniCar);
        transportSet.add(PT);
        transportSet.add(plane);
        transportSet.add(jeep);

        System.out.println("----HashSet print-----");
        for(PassengerTransport s : transportSet) {
            System.out.println(s);
        }

        Map<Integer, String> map = new HashMap<>();

        map.put(1, miniCar.getWay());
        map.put(2, plane.getWay());
        map.put(3, jeep.getWay());

        System.out.println("----HashMap print----");
        map.forEach((k, v) -> System.out.println("key: " + k + " , value: " + v));

        Map<Car, String> carMap = new TreeMap<>(new TransportComparator());

        carMap.put(jeep, "this is jeep");
        carMap.put(truck, "this is truck");
        carMap.put(miniCar, "this is mini");

        System.out.println("----TreeMap print----");
        carMap.forEach((k, v) -> System.out.println("key: " + k + " , value: " + v));


    }
}
// HashSet, TreeMap