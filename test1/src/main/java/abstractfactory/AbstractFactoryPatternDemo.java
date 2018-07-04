package abstractfactory;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:25
 * Version 1.0
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        System.out.println(shapeFactory.getColor("blue") == null);
        System.out.println(colorFactory.getShape("circle") == null);
        if(shapeFactory.getShape("red") == null){
            System.out.println("null");
        }else{
            shapeFactory.getShape("red").draw();
        }
        shapeFactory.getShape("circle").draw();
        if(colorFactory.getColor("circle") == null){
            System.out.println("null");
        }else{
            colorFactory.getColor("circle").fill();
        }
        colorFactory.getColor("blue").fill();
        System.out.println();
    }
}
