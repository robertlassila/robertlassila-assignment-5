package main.java.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int index = 0;
	@Override
	public boolean add(T item) {
		if (index < items.length) {
			items[index] = item;
			index++;
			return true;
		} else if (index >= items.length) {
			Object[] newArray = Arrays.copyOf(items, (items.length * 2)); 
			items = newArray;
			items[index] = item;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public int getSize() {
		int sizeCounter = 0;
		for (Object thing : items) {
			if (thing != null) {
				sizeCounter++;				
			}
		}
		return sizeCounter;
	}

	@Override
	public T get(int index) {
		
	    if (index < 0 || index >= items.length) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + items.length);
	    }
			return ((T) items[index]);

	}
	
}
