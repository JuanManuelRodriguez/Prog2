
public class CentroDeComputo extends Centro{
	String nombre;
	public CentroDeComputo(String nombre){
		super();
		this.nombre=nombre;
	}
	public void ejecutar(Comparable prov, Comparable cons) {
		Computadora pc=(Computadora)prov;
		Proceso pr=(Proceso)cons;
		pc.procesar(pr);
	}
	public static void main(String[] args) {
		CentroDeComputo centro=new CentroDeComputo("JuanMa");
		centro.addProveedor(new Computadora(3));
		centro.addProveedor(new Computadora(4));
		centro.addConsumidor(new Proceso(3));
		centro.addConsumidor(new Proceso(6));
	}
}
