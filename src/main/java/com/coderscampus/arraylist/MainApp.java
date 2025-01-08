package main.java.com.coderscampus.arraylist;

public class MainApp {

	public static void main(String[] args) {
		CustomArrayList<String> list = new CustomArrayList<>();
		list.add("tm");
		list.add("tm");
		list.add("tn");
		System.out.println(list.getSize());
		list.add("tb");
		list.add("tv");
		list.add("tc");
		list.add("tx");
		list.add("td");
		list.add("ts");
		list.add("te");
		System.out.println(list.getSize());
		list.add("ti");
		list.add("o");
		list.add("p");
		System.out.println(list.getSize());
		list.add("b");
		list.add("a");
		list.add("a2");
		list.add("a3");
		list.get(1);
		System.out.println(list.get(0));
		System.out.println(list.get(13));
		System.out.println(list.getSize());
		list.add("tb");
		list.add("tv");
		list.add("tc");
		list.add("tx");
		list.add("td");
		list.add("ts");
		list.add("te");
		System.out.println(list.getSize());
		//System.out.println(list.get(39));
		
		
		
		CustomArrayList<Integer> integerList = new CustomArrayList<>();
		
		for (int i = 0; i < 100000; i++) {
			integerList.add(i);
		}
		
		System.out.println("integerList size: " + integerList.getSize());
		System.out.println("integerList item at index 1: " + integerList.get(1));
		System.out.println("integerList item at index 50000: " + integerList.get(50000));
		System.out.println("integerList item at index 99999: " + integerList.get(99999));
		
		
		
	}

}
