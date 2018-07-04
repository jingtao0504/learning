package builderpattern;

/**
 * @ClassName BuilderPatternDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:49
 * Version 1.0
 **/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();

        Meal me = mb.prepareVegMeal();
        System.out.println("Veg Meal");
        me.showItemList();
        System.out.println("cost:"+me.getCost());


        Meal ml =mb.prepareMeatMeal();
        System.out.println("Meat Meal");
        ml.showItemList();
        System.out.println("cost:"+ml.getCost());
    }
}
