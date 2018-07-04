package factory;

/**
 * @ClassName FactoryPattenDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:18
 * Version 1.0
 **/
public class FactoryPattenDemo {
    public static void main(String[] args) {
        Shape circle = Factory.getShape("circle");
        Shape square = Factory.getShape("square");
        circle.draw();
        square.draw();
    }
}
