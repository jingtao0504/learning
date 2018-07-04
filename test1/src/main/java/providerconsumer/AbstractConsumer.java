package providerconsumer;

/**
 * @ClassName AbstractConsumer
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/30  14:22
 * Version 1.0
 **/
public abstract class AbstractConsumer implements Consumer,Runnable {
    @Override
    public void run() {
        while(true){
            try{
                consume();
            }catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
    }
}
