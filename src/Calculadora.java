import java.util.Vector;

public class Calculadora {
	private Vector operaciones;
	private static final String SUMA="+";
	private static final String RESTA="-";
	private static final String PRODUCTO="*";
	public Calculadora(){
		operaciones=new Vector();
	};
	public void hacerSuma(Operacion n1,Operacion n2,String SUMA){
		Suma s1=new Suma(n1,n2,SUMA);
		System.out.println("El resultado es "+s1.getResultado());
		String numeros="";
		String simbolos="";
		for(int i=0;i<s1.getNumeros().size();i++){
			numeros+=s1.getNumeros().elementAt(i)+", ";
		}
		for(int i=0;i<s1.getSimbolos().size();i++){
			simbolos+=s1.getSimbolos().elementAt(i)+", ";
		}
		System.out.println("Los numeros involucrados son "+numeros);
		System.out.println("Simbolos de las operaciones "+simbolos);
	}
	//falta hacer resta, producto y potencia
	public static void main(String[] args){
		Calculadora c=new Calculadora();
		Numero cuatro= new Numero(4);
		Numero cinco=new Numero(5);
		Suma s1=new Suma(cuatro,cinco,"+");
		Resta r1=new Resta(cinco,cuatro,"-");
		c.hacerSuma(s1, r1, SUMA);
	}
}
