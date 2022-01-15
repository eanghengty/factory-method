package house.phea.java;

public class ApartmentCreator extends HouseCreator{
    public House createHouseInfo(){
        return new Apartment();
    }
}
