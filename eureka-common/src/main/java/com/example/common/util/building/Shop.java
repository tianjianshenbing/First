package com.example.common.util.building;

public class Shop {
    private int bread = 0 ;
    public synchronized void produceBread(){
        if(bread < 10){
            bread++;
            System.out.println(Thread.currentThread().getName()+"开始生产第" + bread + "个面包");
            notify();
        }else {
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeBread(){
        if(bread>0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + bread + "个面包");
            bread--;
            notify();
        }else {
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
