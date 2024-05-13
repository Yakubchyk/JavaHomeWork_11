package com.yk6_ArrayList;

import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public CustomArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Капасити <= 0");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public CustomArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T item) {
        list[size++] = item;
    }

    public void add(int index, T item) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
    }

    public void delete(T item) {
        int pos = index(item);
        if (pos < 0) {
            return;
        }
        delete(pos);
    }

    public void print() {
        for (T elem : list) {
            System.out.print(elem + " ");
        }
    }

    private int index(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }

        }
        return -1;
    }

    public T getList(int index) {
        return list[index];
    }

    public void setList(int index, T item) {
        list[index] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}
