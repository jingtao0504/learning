package ObserverPattern.java;


import java.util.Observable;

/**
 * @ClassName ConcurrentSubject
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/13  17:48
 * Version 1.0
 **/
public class ConcurrentSubject extends Observable{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //通知之前必须先调用setChange方法
        this.setChanged();
        this.notifyObservers();
    }

}
