package Lista3Exercícios_LaçoRepetição;

import java.util.*;

public class Exercício4 {

	public static void main(String[] args) {  
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, caracteristica, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int calmas18=0, nervosas40=0, pessoas=0;
		
		System.out.println("¨¨Pesquisa psicológica¨¨");
		
		while(pessoas <150) {
			System.out.printf("Digite a idade da %dº pessoa: ",(pessoas+1)); 
			idade = leia.nextInt();
			System.out.printf("Digite o sexo da %dº pessoa",(pessoas+1));
			System.out.print("(1-feminino / 2-masculino / 3-Outros): ");
			sexo = leia.nextInt();
			System.out.printf("Digite a característica da %dº pessoa ",(pessoas+1)); 
			System.out.print("(1-pessoa calma / 2-pessoa nervosa / 3-pessoa agressiva): ");
			caracteristica = leia.nextInt();
			
			if(caracteristica==1) {
				pessoasCalmas++;
			}
			if(sexo==1 && caracteristica==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && caracteristica==3) {
				homensAgressivos++;
			}
			if(sexo==3 && caracteristica==1) {
				outrosCalmos++;
			}
			if(idade>40 && caracteristica==2) {
				nervosas40++;
			}
			if(idade<18 && caracteristica==1) {
				calmas18++;
			} pessoas++;
		    }
		
			System.out.printf("\nNúmero de pessoas calmas: %d",pessoasCalmas); 
			System.out.printf("\nNúmero de mulheres nervosas: %d",mulheresNervosas); 
			System.out.printf("\nNúmero de homens agressivos: %d",homensAgressivos);
			System.out.printf("\nNúmero de outros calmos: %d", outrosCalmos);
			System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: %d", nervosas40);
			System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: %d",calmas18);
	}

}
