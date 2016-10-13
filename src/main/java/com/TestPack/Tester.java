package com.TestPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		objectToFileWriter();
		
		fileToObjectConverter();

	}

	private static void fileToObjectConverter() {
		FileInputStream fis = null;
		ObjectInputStream oIS = null;
		try {
			fis = new FileInputStream("E:\\shreyas\\JunkField\\SerialExFile");
			oIS = new ObjectInputStream(fis);
			Player player = (Player) oIS.readObject();
			System.out.println(player.name+" "+player.tShirt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(oIS != null){
				try {
					oIS.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void objectToFileWriter() {
		FileOutputStream fos = null;
		ObjectOutputStream oOS = null;
		Player player = null;
		try {
			
			 fos = new FileOutputStream("E:\\shreyas\\JunkField\\SerialExFile");
			 oOS = new ObjectOutputStream(fos);
			 player = new Player("alpha", 123);
			 oOS.writeObject(player);
			 oOS.flush();
			 System.out.println("Complete");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(oOS != null){
				try{
					oOS.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			if(fos != null){
				try{
					fos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}

}