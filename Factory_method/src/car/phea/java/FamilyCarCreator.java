package car.phea.java;

public class FamilyCarCreator extends CarCreator{
    public Car createCarInfo(){
        return new FamilyCar();
    }
}
