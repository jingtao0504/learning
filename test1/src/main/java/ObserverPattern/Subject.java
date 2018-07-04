package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/4  9:15
 * Version 1.0
 **/
public class Subject {
    List<Observer> observerList = new ArrayList();

    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    protected  void notifyObservers(){
        for(Observer observer :observerList){
            observer.update(this);
        }
    }
}
