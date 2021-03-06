package providerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName BkicjubgQueueModel
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/30  14:30
 * Version 1.0
 **/
public class BlockingQueueModel implements  Model {
    private final BlockingQueue<Task> queue;
    private final  AtomicInteger increTaskNo =  new AtomicInteger(0);

    public BlockingQueueModel(int cap){
        this.queue =  new LinkedBlockingQueue(cap);
    }
    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }

    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }

    private class ConsumerImpl extends AbstractConsumer implements Consumer,Runnable{
        @Override
        public void consume() throws InterruptedException {
            Task task = queue.take();
            // 固定时间范围的消费，模拟相对稳定的服务器处理过程
            Thread.sleep(500+(long)(Math.random()*500));
            System.out.println("consumer"+task.no);
            //System.out.println(queue.size());
        }
    }

    public class ProducerImpl extends AbstractProducer implements  Producer,Runnable{
        @Override
        public void producer() throws InterruptedException {
            // 不定期生产，模拟随机的用户请求
            Thread.sleep((long)(Math.random()*1000));
            Task task = new Task(increTaskNo.getAndIncrement());
            System.out.println("producer");
            queue.put(task);
            System.out.println("produce"+task.no);
        }
    }

    public static void main(String[] args) {
        Model model = new BlockingQueueModel(3);
        for(int i = 0 ;i < 5 ; i++){
            new Thread(model.newRunnableConsumer()).start();
        }
        for(int i = 0; i< 10 ; i++){
            new Thread(model.newRunnableProducer()).start();
        }

    }
}
