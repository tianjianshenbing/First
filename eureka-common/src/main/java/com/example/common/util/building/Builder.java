package building;

public class Builder implements  Runnable {
    private Shop shop;

    public Builder(Shop shop ){
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产");
    }
}
