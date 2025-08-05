package com.example.systemDesign.observer_pattern.observable;

import com.example.systemDesign.observer_pattern.observer.Observer;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
    public void setData(int newStock, int wicket);
    public Object getData();
}
