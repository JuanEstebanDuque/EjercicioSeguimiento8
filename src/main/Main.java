package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> books = new ArrayList<>();
		
		while(true) {
			String o = s.nextLine();
			if(o.equals("")) {
				break;
			}
			
			int numBooks = Integer.parseInt(o);
			String bs = s.nextLine();
			int total = s.nextInt();
			String q = s.nextLine();
			
			String [] arr = bs.split(" ");
			for(int i = 0; i < numBooks; i++) {
				books.add(Integer.parseInt(arr[i]));
			}
			Collections.sort(books);
			
			int m = total/2;
			int half=0;
			for(int i = 0; i<books.size(); i++) {
				if(books.get(i) > m) {
					half = i-1;
					break;
				}
			}
			
			int a = 0;
			int b = 0;
			for(int i = 0; i <= half; i++) {
				for(int j = half+1; j< books.size(); j++) {
					if((total-books.get(i)) == books.get(j)) {
						a = books.get(j);
						b = books.get(i);
					}
					
				}
			}
			
			System.out.println("Peter should buy books whose prices are " + b + " and " + a + ".\n");
		}
		
	}

}
