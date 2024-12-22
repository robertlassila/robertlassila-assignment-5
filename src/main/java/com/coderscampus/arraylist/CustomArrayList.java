package main.java.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int numberOfAdds = 0;
	int addLimit = 10;
	int index = 0;
	@Override
	public boolean add(T item) {
		
		
		if (index >= 1) {
			for (Object thing : items) {
				if (thing != null && thing.equals(item)) {
					return false;
				}
			}
		}
		if (index < addLimit) {
			items[index] = item;
			index++;
			return true;
		} else if (index >= addLimit) {
			addLimit = addLimit * 2;
			Object[] newArray = Arrays.copyOf(items, addLimit); 
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
			sizeCounter++;
		}
		return sizeCounter;
	}

	@Override
	public T get(int index) {
		return ((T) items[index]);
	}
	
}
