package web.model;

public class Car {

    private String model;
    private String bodyType;
    private int numberOfDoors;

    public Car(String model, String bodyType, int numberOfDoors) {
        this.model = model;
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
