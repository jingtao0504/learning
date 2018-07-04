package abstractfactory;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:15
 * Version 1.0
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if(shape==null){
            return null;
        }
        if("Rectangle".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else if("Circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("Square".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
