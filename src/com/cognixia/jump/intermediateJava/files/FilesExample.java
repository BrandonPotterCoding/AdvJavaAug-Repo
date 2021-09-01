package com.cognixia.jump.intermediateJava.files;

import java.io.File;
import java.io.IOException;

public class FilesExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("resources/temp.txt");
		
		System.out.println("Does the file exist: "+file.exists());
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("New file created!");
		}
		System.out.println("Does file.txt exist: "+file.exists());
		
		System.out.println("Absolute path: "+file.getAbsolutePath());
		System.out.println("File name: "+file.getName());
		System.out.println("Last modified: "+file.lastModified());
		
		File dir= new File("resources/dir1");
		
		boolean createdDir1=dir.mkdir();
		
		if(createdDir1) {
			System.out.println("Created new Dir1");
		}
		else {
			System.out.println("Didn't create new Dir1");
		}


		File dirs= new File("resources/dir2/dir3");
		
		boolean createdDirs=dirs.mkdirs();
		
		if(createdDirs) {
			System.out.println("Created new Dirs 2/3");
		}
		else {
			System.out.println("Didn't create new Dirs 2/3");
		}
		//Multiple directories created
		
		/*String[] folderNames= {"dir4","dir5","dir6","dir7"};
		String mainDir= "resources/";
		for(String folder: folderNames) {
			File tempDir= new File(mainDir+folder);
			boolean createdDir=tempDir.mkdir();
			if(createdDir)
				System.out.println("Created new: "+folder+" in directory: "+mainDir);
		}
		
		//Multiple files created
		String[] fileNames= {"file2","file3","file4","file5"};
		String mainDir2= "resources/";
		for(String fileFor: fileNames) {
			File tempFile= new File(mainDir2+fileFor);
			if(!tempFile.exists()) {
				tempFile.createNewFile();
				System.out.println("New file created!");
			}
		}*/

	}
}
