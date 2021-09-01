package com.cognixia.jump.intermediateJava.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacters {

	public static void main(String[] args) {
		
		File file = new File("resources/letters.txt");
		
		FileReader fileReader= null;
		
		BufferedReader reader= null;
		
		try {
			
			fileReader= new FileReader(file);
			reader= new BufferedReader(fileReader);
			
			int charValue;
			
			while( (charValue=reader.read())!=-1){
				char letter = (char) charValue;
				
				
				if(letter=='x')
					break;
				System.out.print(letter);
			}
			reader.skip(5);
			System.out.println("6th Character from 'x' -->"+ (char)reader.read());
			
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception: Could not find file: "+file.getAbsolutePath());
		}
		catch(IOException e) {
			System.out.println("Exception: Could not read Character");
		}
		finally{
			try {
				fileReader.close();
				reader.close();
			}
			catch(IOException e){
				
				System.out.println("Exception: Could not close file!");
				
			}
		}
	}

}
