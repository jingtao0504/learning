package builderpattern;

/**
 * @ClassName Coke
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:33
 * Version 1.0
 **/
public class Coke extends CouldDrink {
    @Override
    public float price() {
        return 5f;
    }

    @Override
    public String name() {
        return "COKE";
    }
}
