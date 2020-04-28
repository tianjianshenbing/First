package design.abstractFactoryPattern;

public class XiaoMFactory implements Factorys {
    @Override
    public Iphone buildingIphone() {
        return new XiaoMiphone();
    }

    @Override
    public IRout buildingIRout() {
        return new XiaoMIRout();
    }
}
