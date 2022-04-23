package com.company;

import java.util.LinkedList;

public class MyQueue<T extends Comparable<T>> {
    private MyLinkedList<T> queue;
    public MyQueue() {
        this.queue = new MyLinkedList<T>();
    }
    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        if(queue.size() == 0){
            return true;
        }
        return false;
    }

    public void add(T item){
        queue.add(item);
    }

    public boolean remove() {
        if(isEmpty()){
            return false;
        }
        queue.removeFirst();
        return true;
    }

    public T top(){
        return (T) queue.get(0);
    }

    public String toString() {
        return queue.toString();
    }
}
