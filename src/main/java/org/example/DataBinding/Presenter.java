package org.example.DataBinding;

import org.example.observable.Observable;
import org.example.observable.Observer;

public abstract class Presenter extends Observable
{
    public enum Configuration
    {
        VIEW_TO_MODEL,
        MODEL_TO_VIEW,
        TWO_WAY
    }

    public Presenter(Observer viewer, Observer model, Configuration configuration)
    {

        switch (configuration)
        {
            case VIEW_TO_MODEL ->
                this.subscribe(model);

            case MODEL_TO_VIEW ->
                this.subscribe(viewer);

            case TWO_WAY ->
            {
                this.subscribe(model);
                this.subscribe(viewer);
            }
        }
    }
}
