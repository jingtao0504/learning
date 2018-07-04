package ObserverPattern.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ConcurrentObserver
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/13  17:53
 * Version 1.0
 **/
public class ConcurrentObserver implements Observer {
    private String name;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者名称："+ name +"，收到了目标推送过来的消息"
                +((ConcurrentSubject)o).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
