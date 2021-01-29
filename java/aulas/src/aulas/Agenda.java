package aulas;

import java.util.*;

public class Agenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		boolean recomeca;
		String resposta, recomecar;
		String agenda[][] = new String [24][31], nome;
		int hora=0, dia=1;

		 do {
		 	System.out.print("Bem-vinde! Digite o seu nome: ");
		    nome = leia.next(); 
		 do { 
		 	System.out.print("Escolha um dia para o evento [1/31]: ");
		 	dia = leia.nextInt();		 
		 while(dia <=0 || dia > 31) {
			System.out.print("\nData incorreta! Escolha uma data entre 1 e 31: ");
			dia = leia.nextInt();
		 }
		 	dia-=1;

		 	System.out.print("Escolha a hora do evento [0/23]: ");
		 	hora = leia.nextInt();
		 	
		 while(hora <0 || hora >23) {
		 	System.out.print("\nHora incorreta! Escolha entre 0 e 23h: ");
			hora = leia.nextInt();
		 }
		 
		 	System.out.print("Informe o evento que acontecerá nessa data e hora: ");
		 	agenda[hora][dia] = leia.next();

		 	System.out.print("Deseja continuar? (S)Sim ou (N)Não?: ");
		 	resposta = leia.next();
		 	
		 	System.out.print("\n");
		 }
		 
		 while(resposta.equals("S"));
		 
		 for(int x= 0; x<31; x++) {
			for(int y=0; y<24;y++)
			{
			    if(agenda[y][x] != "")
			    {
				 System.out.printf(nome,". Dia "+(x+1)+", "+y+"h. Evento: "+agenda[y][x]+"\n");	
			    } 
			}    
		 }
		  
		  System.out.print("\nGostaria de recomeçar? [S]Sim [N]Não: ");
		  recomecar = leia.next();
		  
		  if(recomecar.equals("S")){
		 	recomeca = true;
		  }
		  else
		  {
			recomeca = false;
			System.out.print("\nAté o próximo evento!");
		  }
            } while (recomeca == true); 

	}

}
