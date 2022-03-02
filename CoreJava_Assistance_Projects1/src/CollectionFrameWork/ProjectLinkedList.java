package CollectionFrameWork;

import java.util.LinkedList;

public class ProjectLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Sai Krishna");
		list.add("Seenu");
		list.add("Baahubali");
		list.add("Bhalla");
		
		
		for(String value : list) {
			System.out.println(value);
		}

}
}