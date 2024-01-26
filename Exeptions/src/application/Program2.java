package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\freit\\Meus projetos back end 2024\\meusProjetosBackEnd2024\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error opennig file " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed ");
		}
	}
}
