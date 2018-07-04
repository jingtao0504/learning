package abstractfactory;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:13
 * Version 1.0
 **/
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
