package singleton;

/**
 * @ClassName SingletonInnerClass
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:06
 * Version 1.0
 **/
public class SingletonInnerClass {
    private static class SingletonHolder{
        private static final SingletonInnerClass instance =new SingletonInnerClass();
    }

    private SingletonInnerClass(){

    }

    public static final SingletonInnerClass getInstance(){
        return SingletonHolder.instance;
    }
}
