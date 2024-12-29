package main.java.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int itemCounter = 0;
	@Override
	public boolean add(T item) {
		if (itemCounter >= items.length) {
			Object[] newArray = Arrays.copyOf(items, (items.length * 2)); 
			items = newArray;
		}
		items[itemCounter] = item;
		itemCounter++;
		return true;
	}

	@Override
	public int getSize() {
		return itemCounter;
	}

	@Override
	public T get(int index) {
		
	    if (index < 0 || index >= itemCounter) {
	        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + itemCounter);
	    }
			return ((T) items[index]);

	}
	
}
