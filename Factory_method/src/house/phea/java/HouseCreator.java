package house.phea.java;

public abstract  class HouseCreator {
    public House getHouseInfo(){
        House house = createHouseInfo();
        return house;
    }
    public abstract House createHouseInfo();
}
