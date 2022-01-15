package car.phea.java;

public abstract class CarCreator {
    public Car getCarInfo(){
        Car car = createCarInfo();
        return car;
    }
    public abstract Car createCarInfo();
}
