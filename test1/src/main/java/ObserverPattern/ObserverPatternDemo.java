package ObserverPattern;

/**
 * @ClassName ObserverPatternDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/4  9:37
 * Version 1.0
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcurrentObserver observer = new ConcurrentObserver();
        observer.setPrivateMessage("test1");

        ConcurrentObserver observer2 = new ConcurrentObserver();
        observer2.setPrivateMessage("test2");

        ConcurrentSubject cs = new ConcurrentSubject();
        cs.attach(observer);
        cs.attach(observer2);

        cs.setSubjectName("test");
    }
}
