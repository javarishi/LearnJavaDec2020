package com.h2kinfosys.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadWrite {

	static String filepath = "/RISHI/H2K/FileIO/demofile.txt";
	
	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;
		FileWriter pwriter = null;
		BufferedReader bRead = null;
		BufferedWriter bWrite = null;
		PrintWriter pWrite = null; 
		try {
			reader = new FileReader(filepath); // Character reading
			bRead = new BufferedReader(reader); // Making line out of characters
			
			writer = new FileWriter("/RISHI/H2K/FileIO/demoFile_dec2020.txt");
			bWrite = new BufferedWriter(writer);
			
			pwriter = new FileWriter("/RISHI/H2K/FileIO/demoFile_dec2020_p.txt");
			pWrite = new PrintWriter(pwriter);
			
			String line = null;
			while((line = bRead.readLine()) != null) {
				System.out.println(line);
				bWrite.write(line);
				bWrite.newLine();
				pWrite.write(line);
			}
			bWrite.flush();
			System.out.println("File Read Complete");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			bRead.close();
			bWrite.close();
			pWrite.close();
		}

	}

}
