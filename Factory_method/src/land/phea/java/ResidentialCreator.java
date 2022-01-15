package land.phea.java;

public class ResidentialCreator extends LandCreator{
    public Land createLandInfo(){
        return new Residential();
    }
}
