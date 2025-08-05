package com.example.systemDesign.observer_pattern;

import com.example.systemDesign.observer_pattern.observable.Observable;
import com.example.systemDesign.observer_pattern.observable.ScoreObservable;
import com.example.systemDesign.observer_pattern.observable.StockObservable;
import com.example.systemDesign.observer_pattern.observer.Observer;
import com.example.systemDesign.observer_pattern.observer.ObserverImpl;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        Observable stockObservable = new StockObservable();
        Observable scoreObservable = new ScoreObservable();

        Observer observer1 = new ObserverImpl(scoreObservable);
        Observer observer2 = new ObserverImpl(stockObservable);

        scoreObservable.addObserver(observer1);
        stockObservable.addObserver(observer2);

        scoreObservable.setData(15, 1);
        stockObservable.setData(20, 0);

    }
}
