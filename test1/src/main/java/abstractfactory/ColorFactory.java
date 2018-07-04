package abstractfactory;

/**
 * @ClassName ColorFactory
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:18
 * Version 1.0
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("red".equalsIgnoreCase(color)){
            return new Red();
        }else if("green".equalsIgnoreCase(color)){
            return new Green();
        }else if("blue".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}
