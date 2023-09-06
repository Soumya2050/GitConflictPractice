package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CollectionsMethod {
	
	@Test
	public void  addMethod() {
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"soumya","ranjan","jena","soro","balasore","odisha");
		System.out.println(list);
		for (String string : list) {
			System.out.print(string+" ");
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "ranjan"));
		System.out.println(Collections.binarySearch(list, "odisha"));
		
		for(int i=0;i<list.size();i++)
		{
			
		}
	}
	@Test
	public void copyMethod() {
		
		ArrayList<Object>src = new ArrayList<>();
		
		src.add(10);src.add("snbc");src.add('s');
		
		ArrayList<Object>dest = new ArrayList<>();
//		Collections.addAll(dest, "dnk",'d',10,"zxbnd");
		Collections.disjoint(src, dest);
		
		System.out.println(dest);
	}

}
