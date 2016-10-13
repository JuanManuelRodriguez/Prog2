import java.util.*;
public class ColaOrdenada {
	Vector<Comparable> cola;
	public ColaOrdenada(){
		cola=new Vector<Comparable>();
	}
	public boolean esVacia(){
		return cola.isEmpty();
	}
	public Comparable get(){
		return (Comparable)cola.firstElement();
	}
	public void add(Comparable c){
		for(int i=0;i<cola.size();i++){
			if(cola.elementAt(i).esMenor(c)){//si el elemento actual de la cola es menor que c, guardo el elemento c en la cola
				cola.add(i, c);
			}
		}
	}
	public void remove(){
		if(!cola.isEmpty()){
			cola.remove(0);
		}
	}
}
