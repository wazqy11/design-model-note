package com.djq.code.observer.subject;


import com.djq.code.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserve(Observer o);
    public void notifyObserve();
}
