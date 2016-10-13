
public abstract class Centro {
	ColaOrdenada proveedor;
	ColaOrdenada consumidor;
	public Centro(){
		proveedor=new ColaOrdenada();
		consumidor= new ColaOrdenada();
	}
	public void addProveedor(Comparable c){
		if(consumidor.esVacia()){
			proveedor.add(c);
		}
		else{
			Comparable producto= consumidor.get();
			consumidor.remove();
			this.ejecutar(c,producto);
		}
	}
	public void addConsumidor(Comparable c){
		if(proveedor.esVacia()){
			consumidor.add(c);
		}
		else{
			Comparable productor= proveedor.get();
			proveedor.remove();
			this.ejecutar(productor,c);
		}
	}
	public abstract void ejecutar(Comparable prov,Comparable cons);
}
