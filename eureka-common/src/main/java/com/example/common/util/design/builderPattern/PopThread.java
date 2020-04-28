package design.builderPattern;

public class PopThread implements Runnable
{
    private SafeStack s; //消费者线程需要一个仓库，通过构造方法由外界传入
    public PopThread(SafeStack s)
    {
        this.s = s;
    }

    //重写接口中的run()方法
    public void run()
    {
        //循环100，模拟消费100次的效果
        for(int i=0;i<100;i++)
        {
            //从仓库中取出产品并放入到数组temp中  {8, 0}
            //int temp[] = s.pop();
            int temp = s.pop();
            System.out.println("->"+ temp + "<-"); //8
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}