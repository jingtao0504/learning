package builderpattern;

/**
 * @ClassName Item
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:22
 * Version 1.0
 **/
public interface Item {
    String name();
    Packing packing();
    float price();
}
