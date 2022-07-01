/*
 * MAP
 * HASHMAP
 */
package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
	
	public static void main(String[] args) {
		
		String path = "/Users/PabloTorres/Documents/in.csv";
		Map<String, Integer> voteCount = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line;
			while((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String key = fields[0];
				int value = Integer.parseInt(fields[1]);
				
				value += voteCount.getOrDefault(key, 0);
				voteCount.put(key, value);

			}
			
			for(String key : voteCount.keySet()) {
				System.out.println(key + ": " + voteCount.get(key));
			}
			
		}
		catch(IOException e) { 
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
}
