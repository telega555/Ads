package com.company;

import java.util.LinkedList;

public class MyStack<T extends Comparable<T>>{
    private MyArrayList stack;
    public MyStack() {
        this.stack = new MyArrayList();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public void add(T item){
        stack.add(item);
    }

    public boolean remove() {
        if(isEmpty()){
            return false;
        }
        stack.remove(stack.size() - 1);
        return true;
    }

    public T top(){
        return (T) stack.get(stack.size() - 1);
    }

    public String toString() {
        String res = "";
        res += '[';
        for(int i = 0; i < stack.size(); i++) {
            res += stack.get(i);
            if(i + 1 != stack.size())
                res += ',';
            else
                res += ']';
        }
        return res;
    }

}
