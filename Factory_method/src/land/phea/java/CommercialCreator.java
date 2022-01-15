package land.phea.java;

public class CommercialCreator extends LandCreator{
    public Land createLandInfo(){
        return new Commercial();
    }
}
