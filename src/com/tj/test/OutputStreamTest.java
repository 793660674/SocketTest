package com.tj.test;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) {
		OutputStream out = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				System.out.print(b);
			}
		};
		try {
			generateCharacters(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 static void generateCharacters(OutputStream out) throws IOException{
		int firstPrintableCharacter=33;
		int numberOfPrintableCharacters=94;
		int numberOfCharactersPerLine=72;
		
		
		int start=firstPrintableCharacter;
		while (true) {
			for(int i=start;i<start+numberOfCharactersPerLine;i++){
				out.write((i-firstPrintableCharacter)%numberOfPrintableCharacters+firstPrintableCharacter);
			}
			out.write('\r');
			out.write('\n');
			start=((start+1)-firstPrintableCharacter)%numberOfPrintableCharacters+firstPrintableCharacter;
			}
	}
}
