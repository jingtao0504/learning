package builderpattern;

/**
 * @ClassName MealBuilder
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:42
 * Version 1.0
 **/
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new ChickenBurger());
        meal.addItem(new OrangeJuice());
        return meal;
    }

    public Meal prepareMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
