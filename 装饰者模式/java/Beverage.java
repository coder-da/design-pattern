/**
 * 饮料基类
 */
public abstract class Beverage {
    /**
     * 饮料的描述
     */
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract double cost();
}
