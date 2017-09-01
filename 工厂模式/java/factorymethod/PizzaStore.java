package factorymethod;

import simplefactory.Pizza;

/**
 * Created by 11070781 on 2017/9/1.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
