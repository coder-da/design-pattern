/**
 * 供应咖啡
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        //订一杯浓缩咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //订一杯深焙咖啡，双倍摩卡，加奶泡
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //订一杯综合咖啡，加豆浆、摩卡、奶泡
        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
