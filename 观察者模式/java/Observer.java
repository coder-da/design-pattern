/**
 * 所有气象组件实现此观察者接口，这样，主题通知时，有一个共同的接口。
 */
public interface Observer {
    /**
     * 气象观测值改变时，主题把这些参数传递给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
