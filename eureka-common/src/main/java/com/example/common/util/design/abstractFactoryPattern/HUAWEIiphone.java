package design.abstractFactoryPattern;

public class HUAWEIiphone implements Iphone {
    @Override
    public void sendMessage() {
        System.out.println("我是华为手机能发短信");
    }

    @Override
    public void callup() {
        System.out.println("我是华为手机能发打电话");
    }

    @Override
    public void internet() {
        System.out.println("我是华为手机能发上网");
    }
}
