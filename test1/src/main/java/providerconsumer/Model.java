package providerconsumer;

/**
 * @ClassName Model
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/30  14:26
 * Version 1.0
 **/
public interface Model {
    Runnable newRunnableConsumer();
    Runnable newRunnableProducer();
}
