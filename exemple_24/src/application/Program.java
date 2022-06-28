/*
 * listFiles(File::isDirectory)
 * listFiles(File::isFile)
 * mkdir
 * delete
 */
package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//listing folders
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//listing files
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		//creating a subfolder
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("subdir created successfuly: " + success);
		
//		deleting file			
//		boolean delete = new File("/Users/PabloTorres/Documents/subdir/in.txt").delete();
//		System.out.println("subdir deleted successfuly: " + delete);

		sc.close();
	}

}
