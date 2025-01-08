package com.tka.jan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public interface CopyTxtFile {

	public static void main(String[] args) {
		String path="C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\db.txt";
		String path1="C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\dbCopy.txt";
		
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			
	        fi=new FileInputStream(path);
			fo=new FileOutputStream(path1);
			System.out.println("file opened succesfully");

			

			int d;
			while((d=fi.read())!=-1) {
	//			System.out.print((char)d);
				
				//copy
				fo.write(d);
			}
		}    catch (IOException e1) {
			System.out.println("Something went wrong...");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			if(fo!=null&& fo!=null) {
				try {
					fo.close();
					fi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("File closed succesfully");
			}
		}
	}
	
}
