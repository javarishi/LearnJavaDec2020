package com.h2kinfosys.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException {
		String filepath = "C:\\RISHI\\H2K\\FileIO\\customerObject.obj";
		
		Customer cust = new Customer();
		cust.setCustId(100);
		cust.setName("Niel Armstrong");
		cust.setAddress("3305 Spring Hill Pkwy");
		
		FileOutputStream file = null;
		ObjectOutputStream stream = null;
		
		FileInputStream fis = null;
		ObjectInputStream Ois = null;
		
		try {
			 file = new FileOutputStream(filepath);
			 stream = new ObjectOutputStream(file);
			 
			 fis = new FileInputStream(filepath);
			 Ois = new ObjectInputStream(fis);
			 
			 stream.writeObject(cust);
			 
			 Object readObj = Ois.readObject();
			 // Object instance check
			 if(readObj instanceof Customer) {
				 // Conversion - casting - pasring
				 Customer custOne = (Customer) readObj;
				 System.out.println(custOne.getCustId());
				 System.out.println(custOne.getName());
				 System.out.println(custOne.getAddress());
			 }
			 
			 
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			stream.close();
		}

	}

}
