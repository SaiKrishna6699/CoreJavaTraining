package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ProjectArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Sai Krishna");
		list.add("Rajagopal");
		list.add("Simba");
		list.add("Mufasa");
		list.add("Bahubali");
		list.add("Bhalla");
		
		Iterator<String> itr = list.iterator();
	
		while(itr.hasNext()) {
		String value = itr.next();
			System.out.println(value);
		}
		
		System.out.println();
		
		for(String value : list) {
			
			//
			System.out.println(value);
		}

	}

}
