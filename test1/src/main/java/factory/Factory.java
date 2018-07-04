package factory;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:15
 * Version 1.0
 **/
public class Factory {
    public static Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        if("circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("square".equalsIgnoreCase(shape)){
            return new Sqaure();
        }
        return null;
    }
}
