import com.sun.jmx.snmp.tasks.ThreadService;

import java.util.concurrent.*;

/**
 * @Description TODO
 * @Author jingtao
 * @Date 2018/4/24
 */
public class ThreadPool {

    public static void main(String[] args) {
       //ThreadPoolExecutor tp1 = new ThreadPoolExecutor(10,20,200, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(30));
        ExecutorService tp= Executors.newFixedThreadPool(100);
        for(int i=0;i<50;i++){
            Task1 t = new ThreadPool().new Task1(i);
            tp.execute(t);
            System.out.println("tp-"+tp.getClass());
          //  System.out.println("tp1"+tp1.getClass());
          /* System.out.println("线程池中线程数目："+tp.getPoolSize()+"，队列中等待执行的任务数目："+
                    tp.getQueue().size()+"，已执行玩别的任务数目："+tp.getCompletedTaskCount());*/
        }
        tp.shutdown();
    }

    class Task1 implements  Runnable{
        private int taskNum;
        public  Task1(int i){
            taskNum = i;
        }
        @Override
        public void run(){
            System.out.println("正在执行task"+taskNum);
            try{
                Thread.currentThread().sleep(4000);
            }catch(InterruptedException e){
                System.out.println("exception");
            }
            System.out.println("task"+taskNum+"执行完毕");
        }
    }
}
