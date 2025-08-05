package com.example.systemDesign.observer_pattern.observer;

import com.example.systemDesign.observer_pattern.observable.Observable;
import com.example.systemDesign.observer_pattern.observable.ScoreObservable;
import com.example.systemDesign.observer_pattern.observable.StockObservable;

public class ObserverImpl implements Observer {

    Observable observable;

    public ObserverImpl(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void updateObserver() {
        if (observable instanceof StockObservable) {
            System.out.println("New Stock : " + observable.getData());
        } else if (observable instanceof ScoreObservable) {
            System.out.println((String) observable.getData());
        }
    }
}
