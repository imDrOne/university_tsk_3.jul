package ru.miit;

import javax.enterprise.event.Event;
import ru.miit.annotations.Added;
import ru.miit.annotations.Deleted;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.ArrayList;

@Default
public class NumStore {
    private ArrayList<Integer> numStore;

    @Inject
    @Added
    Event<ArrayList<Integer>> addEvent;

    @Inject
    @Deleted
    Event<ArrayList<Integer>> deleteEvent;



    public NumStore() {
        this.numStore = new ArrayList<>();
    }

    public void setNumStore(ArrayList<Integer> numStore) {
        this.numStore = numStore;
    }

    public ArrayList<Integer> getNumStore() {
        return numStore;
    }

    public void addToNumStore(Integer num) {
        this.numStore.add(num);
        addEvent.fire(numStore);
    }

    public void removeNumFromStoreByIndex(int index) {
        this.numStore.remove(index);
        deleteEvent.fire(numStore);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
