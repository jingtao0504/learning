package singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:59
 * Version 1.0
 **/
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    return new Singleton();
                }
            }
        }
        return instance;

    }
}
