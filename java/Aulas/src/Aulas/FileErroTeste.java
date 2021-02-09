package Aulas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	
	public class FileErroTeste {
		public static void main(String[] args) {
			
			File file = new File("C:\\temp\\in.txt");
			Scanner arq = null;
			
			try
			{
				arq = new Scanner(file);
				while (arq.hasNextLine()) 
				{
					System.out.println(arq.nextLine());
				}
			}
			catch (IOException e)
			{
				System.out.println("Error opening file: " + e.getMessage());
			}
			finally
			{
				if (arq != null) 
				{
					arq.close();
				}
			}
		}
}
