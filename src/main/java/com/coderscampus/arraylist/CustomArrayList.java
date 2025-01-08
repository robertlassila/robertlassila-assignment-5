package main.java.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int size = 0;
	@Override
	public boolean add(T item) {
		if (size >= items.length) { 
			items = Arrays.copyOf(items, (items.length * 2));
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		
	    if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
	    }
			return ((T) items[index]);

	}
	
}
