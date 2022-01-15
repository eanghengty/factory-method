package car.phea.java;

public class SportCarCreator extends CarCreator{
    public Car createCarInfo(){
        return new SportCar();
    }
}
