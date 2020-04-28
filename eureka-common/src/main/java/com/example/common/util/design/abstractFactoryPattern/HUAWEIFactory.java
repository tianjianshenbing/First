package design.abstractFactoryPattern;

public class HUAWEIFactory implements Factorys {
    @Override
    public Iphone buildingIphone() {
        return new HUAWEIiphone();
    }

    @Override
    public IRout buildingIRout() {
        return new HUAWEIIRout();
    }
}
