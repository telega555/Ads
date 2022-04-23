        package com.company;
        public class MyArrayList<T extends Comparable<T>> implements MyList<Object> {
            private Object[] arr;
            private int length = 0;
            private int capacity = 3;
            public MyArrayList() {
                arr = new Object[capacity];
            }
            public void add(Object item) {
                if (length == capacity)
                    increaseCapacity();
                  arr[length++] = item;
            }
            @Override
            public int add(Object item, int index) {
                return index;
            }
            @Override
            public T remove(int index) {
                Object ans = null;
                if(index < 0 || index >= size()){
                    System.out.println("you had problem");
                }else{
                    ans = arr[index];
                    arr[index] = null;
                    length = length - 1;
                }
                return (T)ans;
            }
            @Override
            public Object clear() {
                for (int i = 0; i < length; i++) {
                    arr = null;
                }
                capacity = 3;
                length = 0;

                return null;
            }
            private void increaseCapacity() {
                capacity = 2 * capacity;
                Object[] old = arr;
                arr = new Object[capacity];

                for (int i = 0; i < old.length; i++)
                    arr[i] = old[i];
            }

            public Object get(int index) {
                return (T)arr[index];
            }
            @Override
            public int indexOf(Object o) {
                int index = 0;
                for (int i = 0; i < length; i++) {
                    if(o.equals(arr[i])){
                        return  index = i;
                    }
                    else{
                        return -1;
                    }

                }
                return 0;
            }
            @Override
            public boolean remove(Object item) {
                if(contains(item)==true){
                    remove(indexOf(item));
                    return true;
                }else{
                    return false;
                }
            }

            @Override
            public int lastIndexOf(Object o) {
                int index = 0;
                for (int i = length - 1; i >= 0; i--) {
                    if(o.equals(arr[i])){
                        return  index = i;
                    }

                }
                return 0;
            }

            @Override
            public Object sort() {

                return null;
            }

            public int size() {
                return length;
            }

            @Override
            public boolean contains(Object o) {
                boolean result = false;
                for (int i = 0; i < length; i++)  {
                    if(o.equals(arr[i]) ){
                        result = true;
                    }
                }
                return result;
            }

            @Override
            public String toString() {
                String res = "";
                res += '[';
                for(int i = 0; i < length; i++) {
                    res += arr[i];
                    if(i + 1 != length)
                        res += ',';
                    else
                        res += ']';
                }
                return res;
            }
        }
