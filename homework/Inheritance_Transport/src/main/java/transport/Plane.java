package transport;

public class Plane extends PassengerTransport {

        private boolean airFree = true;
        private Double flightHeight;

        public Plane(int passengersNum, double weight){
                super("air", 0, passengersNum, weight);
        }

        public void noFlightAllowed(){ airFree = false;}
        public void FlightAllowed(){ airFree = true;}

        public Double getFlightHeight() {
                return flightHeight;
        }

        public void setFlightHeight(Double flightHeight) {
                this.flightHeight = flightHeight;
        }

        private boolean weightLimitOK(Car car) {
            if ((car.getWeight()) < 1000.00) {
                return true;
            } else {
                return false;
            }
        }

        public boolean canCarGoOnPlane(Car car){
            if (weightLimitOK(car) && this.getPassNum()<300) {
                FlightAllowed();
                System.out.println(car.getName() + " can fly on this plane");
                return true;
            }
            else{
                noFlightAllowed();
                System.out.println(car.getName() + " cannot fly on this plane");
                return false;
            }
        }


        @Override
        public void checkWay() {
                if (airFree) {
                    System.out.println("free way");
                }
                else System.out.println("no way");
        }

        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("Plane{");
                sb.append("weight=").append(this.getWeight());
                sb.append(", flightHeight=").append(flightHeight);
                sb.append(", number of passengers=").append(this.getPassNum());
                sb.append('}');
                return sb.toString();
        }

        @Override
        public String getName() {
                return "Plane";
        }

}
