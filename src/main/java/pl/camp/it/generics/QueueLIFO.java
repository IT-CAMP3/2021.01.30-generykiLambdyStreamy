package pl.camp.it.generics;

import java.util.ArrayList;
import java.util.List;

public class QueueLIFO<T> {
    List<T> list = new ArrayList<>();

    public void push(T element) {
        this.list.add(element);
    }

    public T pop() {
        if(this.list.size() < 1) {
            throw new EmptyQueueException();
        }
        T element = this.list.get(this.list.size()-1);
        this.list.remove(this.list.size()-1);
        return element;
    }
}
