package org.designpatterns.structural.observer.subject;

import org.designpatterns.structural.observer.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
