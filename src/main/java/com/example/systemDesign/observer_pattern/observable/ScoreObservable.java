package com.example.systemDesign.observer_pattern.observable;

import com.example.systemDesign.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreObservable implements Observable {

    public List<Observer> observers = new ArrayList<>();
    public int score = 0;
    public int wicket = 0;

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
    public void setData(int newScore, int newWicket) {
        if (score != newScore || wicket != newWicket) {
            score = newScore;
            wicket = newWicket;
            notifyObserver();
        }
    }

    @Override
    public Object getData() {
        return "score : " + score + ", wickets : " + wicket;
    }
}
