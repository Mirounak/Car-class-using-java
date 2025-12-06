package Exercise_1;

public class TestClass {
    public static void main(String[] args) {
        Car c1 = new Car("Corvette", "C8", "red", 312, true, 495.0, "petrol", 120, 5000, 60, 16.0);
        Car c2 = new Car("Porsche", "911", "blue", 330, true, 450.0, "petrol", 180, 8000, 64, 10.0);
        Car c3 = new Car("Tesla", "Model S", "green", 250, false, 670.0, "electric", 150, 3000, 45, 12.0);
        
       
        
        c1.DisplayCarDetails();
        System.out.println();
        c2.DisplayCarDetails();
        System.out.println();
        c3.DisplayCarDetails();
        
        
        System.out.println("Before acceleration: " + c1.getAutoMaker() + " speed = " + c1.getSpeed() + " km/h");
        c1.accelerate(50);
        System.out.println("After 50% acceleration: " + c1.getAutoMaker() + " speed = " + c1.getSpeed() + " km/h\n");
        
        System.out.println("Before acceleration: " + c2.getAutoMaker() + " speed = " + c2.getSpeed() + " km/h");
        c2.accelerate(20);
        System.out.println("After 20% acceleration: " + c2.getAutoMaker() + " speed = " + c2.getSpeed() + " km/h\n");
        
       
        System.out.println("Before braking: " + c1.getAutoMaker() + " speed = " + c1.getSpeed() + " km/h");
        c1.brake(3);
        System.out.println("After 3 seconds braking: " + c1.getAutoMaker() + " speed = " + c1.getSpeed() + " km/h\n");
        
        System.out.println("Before braking: " + c3.getAutoMaker() + " speed = " + c3.getSpeed() + " km/h");
        c3.brake(2);
        System.out.println("After 2 seconds braking: " + c3.getAutoMaker() + " speed = " + c3.getSpeed() + " km/h\n");
        
   
        
        c1.travel(100);
        c2.travel(250);
        c3.travel(75);
        
       

        Car fasterCar1 = c1.compareSpeed(c2.compareSpeed(c3));
        System.out.println("Comparing " + c1.getAutoMaker() + " (speed: " + c1.getSpeed() + ") vs " +
                          c2.getAutoMaker() + " (speed: " + c2.getSpeed() + ")");
        System.out.println("Faster car: " + fasterCar1.getAutoMaker() + " " + fasterCar1.getModel() +
                          " with speed " + fasterCar1.getSpeed() + " km/h\n");

        c1.DisplayCarDetails();
        System.out.println();
        c2.DisplayCarDetails();
        System.out.println();
        c3.DisplayCarDetails();
    }
}