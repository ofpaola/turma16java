package Aulas;

import java.util.*;

public class CalculoTriangulo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double maiortri=0, base1, base2, base3, altura1, altura2, altura3, area1, area2, area3, triangulo1, trinagulo2, triangulo3;
		
		System.out.print("Digite a base do triangulo: ");
		base1 = leia.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		altura1 = leia.nextDouble();
		
		System.out.print("Digite a base do triangulo: ");
		base2 = leia.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		altura2 = leia.nextDouble();
		
		System.out.print("Digite a base do triangulo: ");
		base3 = leia.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		altura3 = leia.nextDouble();
		
		area1 = ((base1 * altura1) / 2 );
		area2 = ((base2 * altura2) / 2 );
		area3 = ((base3 * altura3) / 2 );

		System.out.printf("A area do primeiro triângulo informado é %.2f", area1);
		System.out.printf("A area do segundo triângulo informado é %.2f", area2);
		System.out.printf("A area do terceiro triângulo informado é %.2f", area3);
		
		if (area1>=area2 && area1>=area3) {
			System.out.printf("A maior área do triângulo foi %.2f",area1);
		} else if (area2>=area1 && area2>=area3) {
			System.out.printf("A maior área do triângulo foi %.2f\"",area2);
		} else { 
			System.out.printf("A maior área do triângulo foi %.2f\"",area3);
		}
		
	}

}
