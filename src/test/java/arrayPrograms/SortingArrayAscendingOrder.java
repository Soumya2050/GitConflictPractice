package arrayPrograms;

import org.testng.annotations.Test;

public class SortingArrayAscendingOrder {

	public static void main(String[] args) {

		int a[] = { 12, 45, 98, 25, 36, 75 };
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.err.println(a[i]);
		}
	}
	
	@Test
	public void method() {
		System.out.println(" ");
		System.out.println("sanbzdxsmzxbn");
	}

}
