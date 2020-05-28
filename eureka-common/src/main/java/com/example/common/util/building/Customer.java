package com.example.common.util.building;

public class Customer extends Thread {

    private Shop shop;

    public Customer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "消费地"  );
    }

}
