package singleton;

/**
 * @ClassName SingletonPattenDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:56
 * Version 1.0
 **/
public class SingletonPattenDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
