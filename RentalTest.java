interface Rentable{
    double calculateRent(int day);
}
class Car implements Rentable{
    static int totalVehiclesRented;
    static final double TAX_RATE=0.05;

    @Override 
    public double calculateRent(int day){
        totalVehiclesRented++;
        return day*1500;

    }

}
class Bike implements Rentable{
    
    static final double TAX_RATE=0.05;
     @Override 
    public double calculateRent(int day){
        Car.totalVehiclesRented++;
        return day*500;

    }

}
public class RentalTest {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);
        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}