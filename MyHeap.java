package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class MyHeap {

    private LinkedList<Integer> heap;

    public MyHeap(){
        heap = new LinkedList<Integer>();
    }

    public void add(Integer item){
        heap.add(item);
        heapify();
    }

    public void removeRoot(){
        heap.removeFirst();
        heapify();
    }

    boolean remove(Integer item){
        return heap.remove(item);
    }

    private void heapify(){
        Collections.sort(heap);
    }

    @Override
    public String toString(){
        return heap.toString();
    }

}
