package OOP;
public class Vehicle {
    private String brand;
    private String model;
    private int wheels;

    public Vehicle(String brand, String model, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
    }

    public String introduction(){
        String intro="This is my vehicle. I drive a " +brand+ " "+ model+ " and it has "+ wheels+ " wheels.";
        return intro;
    }

    public void start(){
        System.out.println("Starting my vehicle.");
    }

    public void park(){
        System.out.println("I just parked my vehicle.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (wheels != other.wheels)
            return false;
        return true;
    }

}
