package q2014spring;

public interface Subject {
    public void registerObserver(Observer o);   //注册对主题感兴趣的观察者
    public void removeObserver(Observer o);     //删除观察者
    public void notifyObservers();              //当主题发生变化时通知观察者
}
