package com.tka.jan7Task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) {
        String pathImg = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Task\\java.jpg";
        String pathCImg = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Copy\\javaCopy.jpg";

        String pathAud = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Task\\ringtone.mp3";
        String pathCAud = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Copy\\ringtoneCopy.mp3";

        String pathVid = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Task\\video.mp4";
        String pathCVid = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Copy\\videoCopy.mp4";

        // Copy files for differnt files
        copyFile(pathImg, pathCImg);
        copyFile(pathAud, pathCAud);
        copyFile(pathVid, pathCVid);
    }

    // Method to copy a file from source to destination
    public static void copyFile(String sourcePath, String destPath) {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(sourcePath);
            fo = new FileOutputStream(destPath);
            System.out.println("Copying file from: " + sourcePath + " to: " + destPath);

            int data;
            while ((data = fi.read()) != -1) {
                fo.write(data);
            }
            System.out.println("Copy completed successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while copying file: " + sourcePath);
            e.printStackTrace();
        } finally {
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

