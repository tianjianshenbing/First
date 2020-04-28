package design.abstractFactoryPattern;
/**
 * 抽象工厂模式测试
 *
 *
 */

public class Test {
    public static void main(String[] args) {

        System.out.println("***************小米厂商******************");
        Factorys factory= new XiaoMFactory();
        Iphone phone = factory.buildingIphone();
        phone.callup();
        phone.sendMessage();
        phone.internet();


        System.out.println("***************华为厂商******************");
        Factorys factorys = new HUAWEIFactory();
        phone = factorys.buildingIphone();
        phone.callup();
        phone.sendMessage();
        phone.internet();
    }
}
