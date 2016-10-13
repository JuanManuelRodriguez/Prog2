
public class Proceso extends Comparable{
	int memoria;
	public Proceso(int mem){
		this.memoria=mem;
	}
	public boolean esMenor(Comparable c) {
		Proceso proc=(Proceso)c;
		if(this.memoria < proc.memoria){//si el proceso es menor que el pasado por parametro, entonces devuelvo TRUE
			return true;
		}
		return false;
	}

}
