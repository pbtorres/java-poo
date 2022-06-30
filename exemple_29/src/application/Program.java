/*
 * COLLRCTIONS
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		String path = "/users/PabloTorres/Documents/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String name;
			
			while((name = br.readLine()) != null) {
				list.add(name);
			}
			
			Collections.sort(list);
			
			for(String l : list) {
				System.out.println(l);
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage() );
		}

	}

}
