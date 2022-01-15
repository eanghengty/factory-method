package house.phea.java;

public class CondoCreator extends HouseCreator{
    @Override
    public House createHouseInfo() {
        return new Condo();
    }
}
