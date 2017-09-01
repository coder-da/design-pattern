/**
 * 装饰者：调料抽象类
 */
public abstract class CondimentDecorator extends Beverage{
    //所有的调料装饰者都必须重新实现此方法
    public abstract String getDescription();
}
