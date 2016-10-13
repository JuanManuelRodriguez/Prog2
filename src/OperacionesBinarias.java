import java.util.Vector;

public abstract class OperacionesBinarias extends Operacion{
	Operacion n1;
	Operacion n2;
	String simbolo;
	public OperacionesBinarias(Operacion op1,Operacion op2,String simbolo){
		this.n1=op1;
		this.n2=op2;
		this.simbolo=simbolo;
	}
	public abstract double getResultado();
	@Override
	public Vector getNumeros() {
		Vector v1=new Vector();
		Vector v2=new Vector();
		v1.addAll(n1.getNumeros());
		v2.addAll(n2.getNumeros());
		v1.addAll(v2);
		return v1;
	}
	@Override
	public Vector getSimbolos() {
		Vector v1=new Vector();
		Vector v2=new Vector();
		v1.addAll(n1.getSimbolos());
		v2.addAll(n2.getSimbolos());
		v1.add(this.simbolo);
		v1.addAll(v2);
		return v1;
	}
	
}
