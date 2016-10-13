import java.util.Vector;

public class Poster extends Trabajo{
	public Poster(String nombre, Vector<String> palabrasClave){
		super(nombre,palabrasClave);
	}
	public boolean esMiEvaluador(Evaluador eva){
		for(int i=0;i<this.palabrasClave.size();i++){
			for(int j=0;j<eva.conocimientos.size();j++){
				if(eva.conocimientos.elementAt(j)==this.palabrasClave.elementAt(i)){
					return true;
				}
			}
		}
		return false;
	}
}