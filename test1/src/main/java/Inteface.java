import java.time.Clock;

/**
 * @ClassName Inteface
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/8  20:18
 * Version 1.0
 **/
public interface Inteface {
    default String notRequired() {
        return "Default implementation";
    }

    default String abc(){
      return "123";
    }
}
