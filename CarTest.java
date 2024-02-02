public class CarTest
{
     public static void main (String[]args){

         Car japaneseCar = new Car.CarBuilder()
                 .brand("Toyota")
                 .engineType("Diesel")
                 .transmission("Manual")
                 .color("White")
                 .passengerCapacity(8)
                 .build();

         Car germanCar = new Car.CarBuilder()
                 .brand("BMW")
                 .engineType("Gas")
                 .transmission("Automatic")
                 .color("Black")
                 .passengerCapacity(4)
                 .build();

         System.out.println("---Car 1---\nColor: " + japaneseCar.color+ "\nBrand: " + japaneseCar.brand
                +"\nEngine Type: " + japaneseCar.engineType + "\ntransmission: " + japaneseCar.transmission
                +"\nPassenger Capacity: " + japaneseCar.passengerCapacity);

         System.out.println("\n\n---Car 2---\nColor: " + germanCar.color+ "\nBrand: " + germanCar.brand
                 +"\nEngine Type: " + germanCar.engineType + "\ntransmission: " + germanCar.transmission
                 +"\nPassenger Capacity: " + germanCar.passengerCapacity);
    }
}
