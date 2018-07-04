package singleton;

/**
 * @ClassName SingleObject
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:52
 * Version 1.0
 **/
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }
    void showMessage(){
        System.out.println("Hello World");
    }
}
