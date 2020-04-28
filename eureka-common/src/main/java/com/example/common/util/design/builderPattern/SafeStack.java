package design.builderPattern;

public class SafeStack  //用于描述仓库的
{
  private int top = 0;//下标
  private int[] values = new int[10];//数组
  private boolean dataAvailable = false;//压栈出栈的标志  决定生产还是消费的标志

  public void push(int n)//压栈方法 将产品n本身放入仓库的方法
  {
    synchronized(this)//同步，进对象锁池
    {
      while(dataAvailable){//while是循环判断，if是单次判断
        try
        {//必须在synchronized语句块内调用wait
          wait();//等待，交钥匙后进等待池
        }
        catch(InterruptedException e)
        {
          e.printStackTrace();
        }
      }
      //将产品n放入到数组中下标为top的位置，假设该产品是8
      values[top] = n;
      System.out.println("压入数字"+n+"步骤1完成");
      top++;//入栈完成
      dataAvailable = true;//状态变为出栈
      notifyAll();//从等待池中唤醒所有线程
      System.out.println("压入数字完成");
    }  //同步结束
  }

  public int pop() //从仓库中取出一个产品去消费
  {
    synchronized(this)
    {
      while(!dataAvailable)    //3
      {
        try
        {
          wait(); //阻塞
        }
        catch(InterruptedException e)
        {
          e.printStackTrace();
        }
      }
      System.out.print("弹出");
      top--;
      //int[] test = {values[top],top}; // int[] test = {8, 0}; 8代表产品 0下标
      dataAvailable = false;
      //唤醒正在等待压入数据的线程
      notifyAll();
      //return test; //返回消费的产品 并且还返回该产品对应的下标
      return values[top]; //只返回产品，不再返回对应的下标
    }
  }
}