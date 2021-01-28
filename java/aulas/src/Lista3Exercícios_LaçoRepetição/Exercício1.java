package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int x=1000; x<=1999; x++) {
			if (x%11==5)
				System.out.println(x);
		}

	}

}
