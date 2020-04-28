package design.builderPattern;

public class PushThread implements Runnable  //创建线程的第二种方式
{
  private SafeStack s; //生产者线程需要一个仓库，该仓库从外界传进来

  public PushThread(SafeStack s)
  {
    this.s = s;
  }

  //重写接口中的run()方法
  public void run()
  {
    int temp = 0;

    //循环100次，模拟生成100次产品的效果
    for(int i=0;i<100;i++)
    {
      //生成一个0 ~ 9之间的随机数，使用该随机数代表当前生产的产品
      java.util.Random r = new java.util.Random();
      temp = r.nextInt(10);
      //调用仓库类中的push()方法，将生成好的产品temp放入仓库中
      s.push(temp);
      try {
        Thread.sleep(100);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}