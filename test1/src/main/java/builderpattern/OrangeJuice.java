package builderpattern;

/**
 * @ClassName OrangeJuice
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:35
 * Version 1.0
 **/
public class OrangeJuice extends CouldDrink {
    @Override
    public float price() {
        return 6f;
    }

    @Override
    public String name() {
        return "OrangeJuice";
    }
}
