package providerconsumer;

/**
 * @ClassName AbstractProducer
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/30  14:24
 * Version 1.0
 **/
public abstract class AbstractProducer implements  Producer,Runnable {
    @Override
    public void run() {
        while(true){
            try{
                producer();
            }catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
    }
}
