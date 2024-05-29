package OOP.car_system;

public class Car extends Vehicle{
        private int seatingCapacity;

        /*public Car{
            super();
            super.setType("Car");
        }*/
        public Car(String make, String model, int year, int seatingCapacity) {
            super(make, model, year);
            this.seatingCapacity = seatingCapacity;
        }

        @Override
        public String getDetailedInfo() {
            return super.toString() + "(" + getType() + ")" + "\n" + "Seating Capacity: " + seatingCapacity + " people\n" + getReview();
        }
}
