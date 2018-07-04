package abstractfactory;

/**
 * @ClassName FactoryProducer
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  16:22
 * Version 1.0
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(null == choice){
            return null;
        }
        if("shape".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
