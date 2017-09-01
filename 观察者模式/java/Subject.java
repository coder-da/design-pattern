/**
 * 主题接口，对象使用此接口注册为观察者，或者把自己从观察者中移除。
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer o);

    //移除观察者
    void removeObserver(Observer o);

    //主题状态改变时，此方法被调用，以通知所有的观察者
    void notifyObservers();
}
