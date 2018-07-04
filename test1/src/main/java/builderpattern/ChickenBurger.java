package builderpattern;

/**
 * @ClassName ChickenBurger
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:32
 * Version 1.0
 **/
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
