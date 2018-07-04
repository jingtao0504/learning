package ObserverPattern;

/**
 * @ClassName ConcurrentSubject
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/4  9:28
 * Version 1.0
 **/
public class ConcurrentSubject extends Subject {
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        this.notifyObservers();
    }
}
