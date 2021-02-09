package pl.camp.it.generics;

import java.util.ArrayList;
import java.util.List;

public class QueueFIFO<TYP> {
    List<TYP> list = new ArrayList<>();

    public void push(TYP element) {
        list.add(element);
    }

    public TYP pop() {
        if(list.size() < 1) {
            throw new EmptyQueueException();
        }

        TYP element = this.list.get(0);
        this.list.remove(0);
        return element;
    }
}
