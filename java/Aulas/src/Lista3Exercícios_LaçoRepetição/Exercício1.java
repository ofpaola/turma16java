package Lista3Exerc�cios_La�oRepeti��o;

import java.util.*;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		for(int x=1000; x<=1999; x++) {
			if (x%11==5)
				System.out.println(x);
		}

	}

}
