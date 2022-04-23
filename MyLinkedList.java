package com.company;
public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{
    private class MyNode<T>{
        T data;
        MyNode<T> next;
        MyNode(T data) {
            this.data = data;
        }
    }
    private int length = 0;
    private MyNode<T> head, tail;
    public MyLinkedList() {
        head = null;
        tail = null;
    }
    @Override
    public void add(T item) {
        MyNode<T> N = new MyNode<>(item);
        if (head == null) {
            head = tail = N;
        } else {
            tail.next = N;
            tail = N;
        }
        length++;
    }

    @Override
    public boolean remove(T item) {
        boolean result = false;
        if(contains(item)){
            int index = indexOf(item);
            remove(index);
            result = true;
        }
        return result;
    }

    public void removeFirst(){
//        MyNode<T> N = new MyNode<>();
        head = head.next;
    }

    @Override
    public Object clear() {
        head=null;
        tail=null;
        length=0;
        return null;
    }
    public T get(int index) {
        if (index >= length || index < 0)
            throw new IndexOutOfBoundsException("You have problem");
        MyNode<T> t = head;
        while (index != 0) {
            t = t.next;
            index--;
        }
        return t.data;
    }
    @Override
    public boolean contains(Object o) {
        boolean result = false;
        for(MyNode i = head; i != null; i=i.next){
            if(i.data==o){
                result = true;
                break;
            }
        }
        return result;
    }
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if(contains(o)){
            for(MyNode i = head;i!=null;i=i.next){
                if(o.equals(i.data)){
                    break;
                }
                index++;
            }
        }else{
            index = -1;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        int count = 0;
        if(contains(o)){
            for(MyNode i = head;i!=null;i=i.next){
                if(o.equals(i.data)){
                    index = count;
                }
               count++;
            }
        }else{
            index = -1;
        }
        return index;
    }
    @Override
    public T sort() {
        return null;
    }
    @Override
    public int size() {
        return length;
    }
    @Override
    public T remove(int index) {
        return null;
    }
    @Override
    public int add(T item, int index) {
        return index;
    }
    @Override
    public String toString(){
        String res = "[";
        for(MyNode i = head;i!=null;i=i.next){
            res += i.data;
            if(i.next != null)
                res += ',';
            else
                res += ']';
        }
        return res;
    }


}
