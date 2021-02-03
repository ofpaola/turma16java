package Lista5Exercícios_POO;

public class Ex2AviaoClasse {
		
		String tipo;
		int qntdAssentos;
		
		public String tipo() {
			return tipo;
		}
		public void tipo (String tipo) {
			this.tipo = tipo;
		}
		
		public int qntdAssentos() {
			return qntdAssentos;
		}
		public void qntdAssentos (int qntdAssentos) {
			this.qntdAssentos = qntdAssentos;
		}
		
		public Ex2AviaoClasse (String tipo, int qntdAssentos) {
			this.tipo = tipo;
			this.qntdAssentos = qntdAssentos;
		}
}
