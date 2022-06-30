/*
 * SET
 * HASHSET
 * HASHCODE 
 * EQUALS
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		String path = "/Users/PabloTorres/Documents/log.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) { 
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date instante = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, instante));
				
				line = br.readLine();
				
			}
			
			for(LogEntry l : set) {
				System.out.println(l.getUserName());
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch(IOException e ) {
			
			System.out.println("Error: " + e.getMessage());
		
		}
	}
}
