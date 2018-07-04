package builderpattern;

/**
 * @ClassName CouldDrink
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:28
 * Version 1.0
 **/
public abstract class CouldDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }


}
