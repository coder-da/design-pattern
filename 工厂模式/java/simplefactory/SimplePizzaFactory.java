package simplefactory;

/**
 * 披萨简单工厂类，创建披萨对象
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
