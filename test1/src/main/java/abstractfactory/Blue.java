package abstractfactory;

/**
 * @ClassName Blue
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:12
 * Version 1.0
 **/
public class Blue implements  Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
