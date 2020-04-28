package design.factoryMethodPattern;

public class Tesla implements Car {
    @Override
    public void run() {
        System.out.println("我是特斯拉 ： 车速100km/h");
    }
}
