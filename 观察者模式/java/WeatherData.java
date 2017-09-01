import java.util.ArrayList;

/**
 * 发布气象台数据
 */
public class WeatherData implements Subject{
    //储存注册的观察者
    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    //注册观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除观察者
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //通知观察者
    @Override
    public void notifyObservers() {
        for (int i=0; i<observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged(){
        notifyObservers();
    }

    //测试数据改变时用
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
