package ru.miit;

import javax.inject.Inject;
import java.util.ArrayList;

public class NumStore {
    private ArrayList<Integer> numStore;

    public NumStore() {
        super();
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
    }

    public void removeNumFromStoreByIndex(int index) {
        this.numStore.remove(index);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
