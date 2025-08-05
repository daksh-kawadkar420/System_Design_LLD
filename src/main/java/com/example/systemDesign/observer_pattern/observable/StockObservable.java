package com.example.systemDesign.observer_pattern.observable;

import com.example.systemDesign.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements Observable {

    public List<Observer> observers = new ArrayList<>();
    public int stock = 0;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.updateObserver();
        }
    }

    @Override
    public void setData(int newStock, int discount) {
        if (stock == 0) {
            stock += newStock;
            notifyObserver();
        }
    }

    @Override
    public Object getData() {
        return stock;
    }
}
