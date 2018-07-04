package builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Meal
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:37
 * Version 1.0
 **/
public class Meal {
    private List<Item> itemList = new ArrayList();
    public void  addItem(Item item){
        itemList.add(item);
    }
    public float getCost(){
        float cost =0.0f;
        for(Item item :itemList){
            cost += item.price();
        }
        return cost;
    }
    public void showItemList(){
        for(Item item : itemList){
            System.out.println("item:"+item.name());
            System.out.println(",packing:"+item.packing().pack());
            System.out.println(",price:"+item.price());
        }
    }
}
