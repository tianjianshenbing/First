package design.abstractFactoryPattern;

public class HUAWEIIRout implements IRout {
    @Override
    public void setting() {
        System.out.println("我是华为路由器 能改设置");
    }

    @Override
    public void openning() {
        System.out.println("我是华为路由器能打开");
    }

    @Override
    public void closing() {
        System.out.println("我是华为路由器能关闭");
    }
}
