package com.yk4_Generic;

public class Storage<T> {

    private T it;

    public Storage() {
    }

    public Storage(T it) {
        this.it = it;
    }

    public T getIt() {
        return it;
    }

    public void setIt(T it) {
        this.it = it;
    }

}
