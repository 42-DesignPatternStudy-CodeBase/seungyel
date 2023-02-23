package observerPattern;

import java.util.*;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.forEach((observer) -> {
            observer.update(this);
        });
    }

    public abstract int getNumber();
    public abstract void execute();
}