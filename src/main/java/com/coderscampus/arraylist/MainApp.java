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
		System.out.println(list.get(39));
		
		
		
//		CustomArrayList<Integer> integerList = new CustomArrayList<>();
//		integerList.add(2);
//		integerList.add(67);
//		integerList.add(24);
//		integerList.add(32);
//		integerList.add(26);
//		System.out.println(integerList.getSize());
//		System.out.println(integerList.get(0));
		
		
		
	}

}
