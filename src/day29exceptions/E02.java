package day29exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/day29exceptions/textfil");
			int k=0;
			
			while((k=fis.read())!=-1) {
				System.out.print((char) k);
				
	
			}	
		} catch (IOException e) {
			
			System.out.println("Ya path yanlis, ya dosya silindi ya da okunamayacak halde");
		}finally {
			System.out.println("finally block calisti");
			fis.close();
		}
		
		
		}
		
	}


