import java.util.*;
public class Trabajo {
	String nombre;
	Vector<String> palabrasClave;
	public Trabajo(String nombre,Vector<String> palabrasClave){
		this.nombre=nombre;
		this.palabrasClave=palabrasClave;
	}
	public boolean esMiEvaluador(Evaluador eva){
		for(int i=0;i<palabrasClave.size();i++){
			if(!eva.conocimientos.contains(palabrasClave.elementAt(i))){
				return false;
			}
		}
		return true;
	}
}
