package grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;
public class ReverseAStringUsing5Ways {

	@Test
	public void method1() {
		String s = "soumyaranjan";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	@Test
	public void method2() {
		String s = "soumyaranjan";
		for (int i = s.length() - 1; i >= 0; i--) {
			StringBuilder sb = new StringBuilder();
			System.out.print(sb.append(s.charAt(i)).reverse());

		}
	}

	@Test
	public void method3() {

		String s = "soumyaranjan";
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	@Test
	public void method4() {
		String s = "soumyaranjan";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

	@Test
	public void method5() {
		String s = "soumyaranjan";
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		Collections.reverse(list);
		for (Character character : list) {
			System.out.print(character);
		}
	}
	
	@Test
	public void stringpro() {
		String s[]= {"gsdfg","sdnb","fjghmd"};

		for(int i=0;i<s.length;i++)
		{
			String str="";
			String b=s[i];
			for(int j=b.length()-1;j>=0;j--)
			{
				str=str+b.charAt(j);
			}
			s[i]=str+" ";
		}
		System.out.print(Arrays.toString(s));
		
	}

}
