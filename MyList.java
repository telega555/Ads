package com.company;


    public interface MyList<T> {
        int size();
        boolean contains(Object o);
        void add(T item);
        int add(T item, int index);
        boolean remove(T item);
        T remove(int index);
        Object clear();
        T get(int index);
        int indexOf(Object o);
        int lastIndexOf(Object o);
        T sort();
    }


