
public class Resta extends OperacionesBinarias{
	public Resta(Operacion op1, Operacion op2, String simbolo) {
		super(op1, op2, simbolo);
	}

	@Override
	public double getResultado() {
		return this.n1.getResultado()-this.n2.getResultado();
	}
}
