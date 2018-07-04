package builderpattern;

/**
 * @ClassName Burger
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:27
 * Version 1.0
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }


}
