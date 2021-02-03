package Lista5Exercícios_POO;

public class Ex2AviaoObjeto {
	public static void main(String[] args) {
		
		Ex2AviaoClasse aviao1 = new Ex2AviaoClasse("AirBus",90);
		Ex2AviaoClasse aviao2 = new Ex2AviaoClasse("Boeing",120);
		Ex2AviaoClasse aviao3 = new Ex2AviaoClasse("Bombardier",60);
		
		System.out.println("Quantidade de assentos\tAvião");
		System.out.println(aviao1.qntdAssentos+"\t\t\t"+aviao1.tipo);
		System.out.println(aviao2.qntdAssentos+"\t\t\t"+aviao2.tipo);
		System.out.println(aviao3.qntdAssentos+"\t\t\t"+aviao3.tipo);
	}

}
