package land.phea.java;

public abstract class LandCreator{
    public Land getLandInfo(){
        Land land= createLandInfo();
        return land;
    }

    public abstract Land createLandInfo();
}
