/*
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		
		/*--------- SOURCE FILE PATH ------------*/
		String sourceFileStr = sc.nextLine();
		File sourceFile = new File(sourceFileStr); 
		
		/*---------- DIRECTORY FOLDER --------*/
		String sourceFolder = sourceFile.getParent();
		
		/*---------- MAKE SUBFOLDER -------------*/
		boolean success = new File(sourceFolder + "/out").mkdir();	
		
		if(success)
			System.out.println(success + "SUBFOLDER CREATED");
		else
			System.out.println(success + "SUBFOLDER NOT CREATED");
		
		/*----------- OUT FILE PATH ------------*/
		String targetFileStr = sourceFolder + "/out/sumary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){ //Bloco try-with-resources
			
			String itemCsv = br.readLine();
			
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { 
				
				for (Product item : list) { 
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " CREATED");
				
			}
			catch (IOException e) { 
				System.out.println("Error writing file " + e.getMessage());
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();

		/*------------------------- SOURCE FILE ---------------------------------*/
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { 
			
			System.out.println("SOURCE FILE: ");

			String line = br.readLine();
			
			while (line != null) { 
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) { 
			System.out.println("ERROR " + e.getMessage());
		}
		
		System.out.println();
		
		/*------------------------ OUT FILE ------------------------------------*/
		try (BufferedReader br = new BufferedReader(new FileReader(targetFileStr))) { 
			
			System.out.println("OUT FILE: ");

			String line = br.readLine();
			
			while (line != null) { 
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) { 
			System.out.println("ERROR " + e.getMessage());
		}
		
		sc.close();
	}

}
