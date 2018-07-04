package builderpattern;

/**
 * @ClassName Bottle
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:26
 * Version 1.0
 **/
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
