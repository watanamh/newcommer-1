package com.sample.app;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;


public class App {
	
	public static void main(String[] args) {
		if (ArrayUtils.isEmpty(args)) {
			System.err.println("引数が無いよ。");
		}
		else {
			System.out.println("はろー だいきょー" + args[0]);
			
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("パス＞");
				String path = reader.readLine();
				
				BufferedReader br = new BufferedReader(new FileReader(path));
				String buf;
				while((buf = br.readLine()) != null) {
					System.out.println(buf);
				}
			} catch (IOException ie){
				ie.printStackTrace();
			}
		}
	}
}
