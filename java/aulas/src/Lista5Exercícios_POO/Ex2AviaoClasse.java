package Lista5Exercícios_POO;

public class Ex2AviaoClasse {
		
		String tipo;
		int qntdAssentos;
		
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public int getQntdAssentos() {
			return qntdAssentos;
		}
		public void setQntdAssentos(int qntdAssentos) {
			this.qntdAssentos = qntdAssentos;
		}

		public Ex2AviaoClasse (String tipo, int qntdAssentos) {
			this.tipo = tipo;
			this.qntdAssentos = qntdAssentos;
		}
}
