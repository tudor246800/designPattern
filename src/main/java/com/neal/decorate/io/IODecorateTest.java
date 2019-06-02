package com.neal.HeadFirstPractise.decorate.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODecorateTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
		while ((c = in.read()) >= 0) {
			System.out.println((char) c);

		}
		
		in.close();
	}
}
