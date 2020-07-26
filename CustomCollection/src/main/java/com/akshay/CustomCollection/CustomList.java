package com.akshay.CustomCollection;


import java.util.Arrays;
 
public class CustomList<E> 
{
    private int size = 0;
    private static final int listCapacity = 10;
    private Object listElements[];
 
    public CustomList() {
        listElements = new Object[listCapacity];
    }
 
    private void ensureCapacity() {
        int newSize = listElements.length * 2;
        listElements = Arrays.copyOf(listElements, newSize);
    }
    
    public void add(E element) {
        if (size == listElements.length) {
            ensureCapacity();
        }
        listElements[size++] = element;
    }
    
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) listElements[index];
    }
     
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object item = listElements[index];
        int numElts = listElements.length - ( index + 1 ) ;
        System.arraycopy( listElements, index + 1, listElements, index, numElts ) ;
        size--;
        return (E) item;
    }
     
    
    public int size() {
        return size;
    }
     
    public String toString() 
    {
         StringBuilder listStr = new StringBuilder();
         listStr.append('[');
         for(int i = 0; i < size ;i++) {
        	 listStr.append(listElements[i].toString());
             if(i<size-1){
            	 listStr.append(",");
             }
         }
         listStr.append(']');
         return listStr.toString();
    }

}
