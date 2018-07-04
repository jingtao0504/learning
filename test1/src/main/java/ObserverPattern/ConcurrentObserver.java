package ObserverPattern;

/**
 * @ClassName ConcurrentObserver
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/4  9:26
 * Version 1.0
 **/
public class ConcurrentObserver implements Observer {
    private String subjectName;
    private String privateMessage;
    @Override
    public void update(Subject subject) {
        subjectName = ((ConcurrentSubject)subject).getSubjectName();
        System.out.println(subjectName+privateMessage);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getPrivateMessage() {
        return privateMessage;
    }

    public void setPrivateMessage(String privateMessage) {
        this.privateMessage = privateMessage;
    }
}
