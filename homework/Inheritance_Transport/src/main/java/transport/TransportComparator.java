package transport;

import java.util.Comparator;

public class TransportComparator implements Comparator<PassengerTransport> {
    @Override
    public int compare(PassengerTransport o1, PassengerTransport o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
        /*double weightDiff = o1.getWeight() - o2.getWeight();
        if (weightDiff<0){ return -1;}
        else if (weightDiff>0){ return 1;}
        else return 0;*/
    }
}
