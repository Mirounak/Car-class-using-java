package Exercise_1;

public class Car {
    private String AutoMaker;
    private String Model;
    private String color;
    private int MaxSpeed;
    private boolean AutoT;
    private double enginePower;
    private String energy;
    private int speed;
    private int KmAge;
    private double reserve;
    private double consume;

    public Car(String autoMaker, String model, String color, int maxSpeed, boolean automaticTransmission, double enginePower, String energy, int speed, int kmAge, double reserve, double consume) {
        this.AutoMaker = autoMaker;
        this.Model = model;
        this.color = color;
        this.MaxSpeed = maxSpeed;
        this.AutoT = automaticTransmission;
        this.enginePower = enginePower;
        this.energy = energy;
        this.speed = speed;
        this.KmAge = kmAge;
        this.reserve = reserve;
        this.consume = consume;
    }

    public String getAutoMaker(){ return AutoMaker; }
    public String getModel(){ return Model; }
    public String getColor(){ return color; }
    public boolean isAutomaticTransmission(){ return AutoT; }
    public String getEnergy(){ return energy; }
    public int getMaxSpeed() { return MaxSpeed; }
    public int getSpeed() { return speed; }
    public int getKmAge(){ return KmAge; }
    public double getEnginePower(){ return enginePower; }
    public double getReserve(){ return reserve; }
    public double getConsume(){ return consume; }

    public void setAutoMaker(String autoMaker){ this.AutoMaker = autoMaker; }
    public void setModel(String model){ this.Model = model; }
    public void setAutomaticTransmission(boolean automaticTransmission){ this.AutoT = automaticTransmission; }
    public void setEnergy(String energy){ this.energy = energy; }
    public void setMaxSpeed(int maxSpeed){ this.MaxSpeed = maxSpeed; }
    public void setSpeed(int speed){ this.speed = speed; }
    public void setKmAge(int kmAge){ this.KmAge = kmAge; }
    public void setEnginePower(double enginePower){ this.enginePower = enginePower; }
    public void setReserve(double reserve){ this.reserve = reserve; }
    public void setConsume(double consume){ this.consume = consume; }
    
    public void accelerate(int acc){
        speed = speed + (speed * acc / 100);
        if(speed > MaxSpeed){ speed = MaxSpeed; }
    }
    
    public void brake(int nbsec){
        speed = speed - (speed * nbsec * 10 / 100);
        if(speed < 0){ speed = 0; }
    }
    
    public void DisplayCarDetails(){
        System.out.println("Auto Maker: " + AutoMaker);
        System.out.println("Model: " + Model);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + MaxSpeed + " km/h");
        System.out.println("Automatic Transmission: " + (AutoT ? "Yes" : "No"));
        System.out.println("Engine Power: " + enginePower + " HP");
        System.out.println("Energy Type: " + energy);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Distance Traveled: " + KmAge + " km");
        System.out.println("Fuel Reserve: " + reserve + " liters");
        System.out.println("Fuel Consumption: " + consume + " L/100km");
    }
    
    public void travel(int dist){
        KmAge += dist;
        reserve -= (dist * consume / 100);
        if(reserve < 0) {
            reserve = 0;
            System.out.println("Warning: Fuel reserve is empty!");
        }
        System.out.println(AutoMaker + " " + Model + " traveled " + dist + " km. Total distance: " + KmAge + " km");
    }
    
    public Car compareSpeed(Car c){
        
        if(c.speed > this.speed)
            return c;
        else
            return this;
    }
}
