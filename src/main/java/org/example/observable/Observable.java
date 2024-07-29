package org.example.observable;

import java.util.ArrayList;

public class Observable
{
    private final ArrayList<Observer> observables;

    public Observable()
    {
        observables = new ArrayList<>();
    }

    public void subscribe(Observer o)
    {
        observables.add(o);
    }

    public void unsubscribe(Observer o)
    {
        observables.remove(o);
    }

    public void update(String event)
    {
        for(Observer o : observables)
        {
            o.update(event);
        }
    }
}
