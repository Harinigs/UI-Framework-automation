package com.notepad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_from_notepad {
	public static void main(String[] args) throws FileNotFoundException {
		File doc = new File("C:\\Users\\Harin\\Desktop\\Greens Java\\SELENIUM\\Notepad Assignment\\Ukraine.txt");	
		Scanner scan = new Scanner(doc);
		
		scan.delimiter();
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
	}

}
