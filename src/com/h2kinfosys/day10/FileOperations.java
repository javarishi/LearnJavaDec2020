package com.h2kinfosys.day10;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	static String sampleFile = "C:\\RISHI\\H2K\\FileIO\\sampleOne.txt";
	static String sampleDir = "C:\\RISHI\\H2K\\FileIO";
	static String new_sampleDir = "C:\\RISHI\\H2K\\FileIO\\newDir";
	
	public static void main(String[] args) throws IOException {
		File fileOne = new File(sampleFile);
		if(fileOne.exists()) {
			System.out.println("FileOne does exists");
		}else {
			fileOne.createNewFile();
		}
		
		System.out.println("fileOne.canRead() :: " + fileOne.canRead());
		System.out.println("fileOne.canWrite() :: " + fileOne.canWrite());
		System.out.println("fileOne.canExecute() :: " + fileOne.canExecute());
		
		System.out.println("fileOne.getName() :: " + fileOne.getName());
		System.out.println("fileOne.getParent() :: " + fileOne.getParent());
		System.out.println("fileOne.getPath() :: " + fileOne.getPath());
		System.out.println("fileOne.getAbsolutePath() :: " + fileOne.getAbsolutePath());
		System.out.println("fileOne.getCanonicalPath() :: " + fileOne.getCanonicalPath());
		
		File dirFile = new File(sampleDir);
		if(dirFile.isDirectory()) {
			System.out.println("Yes " + dirFile.getName()  + " is a Directory ");
			File[] listFiles = dirFile.listFiles();
			
			for(File eachFile : listFiles) {
				System.out.println(eachFile.getName());
				if(eachFile.getName().indexOf(".obj") != -1) {
					System.out.println(eachFile.getName() + " being Deleted");
					eachFile.delete();
				}
			}
		}
		File newDir = new File(new_sampleDir);
		newDir.mkdir();
		System.out.println("Delete dir now");
		newDir.delete();
	}

}
