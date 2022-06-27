package OOP;
public class Bike extends Vehicle{
    private int wheels=2;

    public Bike(String brand, String model) {
        super(brand, model);
        super.setWheels(wheels);

    }

    public void doWheelie(){
        System.out.println("I am now doing a wheelie!");
    }

    public void splittingLanes(){
        System.out.println("I just split the lanes! See ya traffic!");
    }

    @Override
    public String introduction(){
        String intro=super.introduction();
        intro+= "This is a bike.";
        return intro;
    }
    
}
