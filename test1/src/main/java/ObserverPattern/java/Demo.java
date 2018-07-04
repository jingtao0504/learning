package ObserverPattern.java;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/13  17:56
 * Version 1.0
 **/
public class Demo {

    public static void main(String[] args) {
        ConcurrentSubject subject = new ConcurrentSubject();
        ConcurrentObserver girl = new ConcurrentObserver();
        ConcurrentObserver boy = new ConcurrentObserver();
        girl.setName("girl");
        boy.setName("boy");
        subject.addObserver(boy);
        subject.addObserver(girl);
        subject.deleteObserver(boy);
        subject.setContent("测试好不好用");
    }
}
