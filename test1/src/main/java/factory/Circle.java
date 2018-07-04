package factory;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:10
 * Version 1.0
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
