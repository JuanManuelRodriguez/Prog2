import java.util.Vector;

public class Numero extends Operacion{
		private int valor;
		public Numero(int valor){
			this.valor=valor;
		}
		public void setValor(int valor){
			this.valor=valor;
		}
		public double getResultado(){
			return this.valor;
		}
		public Vector getNumeros(){
			Vector salida=new Vector();
			salida.add(this.valor);
			return salida;
		}
		public Vector getSimbolos(){
			return new Vector();
		}
}
