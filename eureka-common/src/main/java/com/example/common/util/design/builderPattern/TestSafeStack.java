package design.builderPattern;
public class TestSafeStack{

	public static void main(String[] args){
		SafeStack s = new SafeStack(); //创建一个仓库，最多能放10个产品

		//创建生产者线程的对象，并将上面的仓库传入
		PushThread r1 = new PushThread(s);
		//创建消费者线程的对象，并将上面的仓库传入，保证生产者消费者使用同一个仓库
		PopThread r2 = new PopThread(s);

		//使用上面的生产者线程对象创建线程对象
		Thread t1 = new Thread(r1);
		//使用上面的消费者线程对象创建线程对象
		Thread t2 = new Thread(r2);

		//调用生产者线程类中的run()方法
		t1.start();
		//调用消费者线程中的run()方法
		t2.start();
		System.gc();
	}
}