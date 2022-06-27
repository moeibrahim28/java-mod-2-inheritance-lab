package OOP;
public class Car extends Vehicle{
    private int wheels=4;

    public Car(String brand, String model) {
        super(brand, model);
        super.setWheels(wheels);

    }

    public void putGroceries(){
        System.out.println("I put the groceries in my trunk.");
    }

    public void openSunroof(){
        System.out.println("I just opened the sunroof.");
    }

    @Override
    public String introduction(){
        String intro=super.introduction();
        intro+= "This is a car.";
        return intro;
    }
    
}
