import java.util.Vector;
public class Evaluador {
	int id;
	Vector<String> conocimientos;
	public Evaluador(int id,Vector<String> conoc){
		this.id=id;
		conocimientos=conoc;
	}
	public boolean soyParaEsteTrabajo(Trabajo t){
		for(int i=0;i<t.palabrasClave.size();i++){
			if(!conocimientos.contains(t.palabrasClave.elementAt(i))){
				return false;
			}
		}
		return true;
	}
	public boolean experto(Vector<String> conocimientosEspecificos){
		for(int i=0;i<conocimientosEspecificos.size();i++){
			if(!conocimientos.contains(conocimientosEspecificos.elementAt(i))){
				return false;
			}
		}
		return true;
	}
}
