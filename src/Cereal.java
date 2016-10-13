import java.util.Vector;

public class Cereal {
	String nombre;
	Vector<String> mineralesNecesarios;
	public Cereal(String nombre,Vector<String> minerales){
		mineralesNecesarios=minerales;
		this.nombre=nombre;
		
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean puedoPlantarme(Lote lote){
		for(int i=0;i<mineralesNecesarios.size();i++){
			if(!lote.contiene(mineralesNecesarios.elementAt(i))){
				return false;
			}
		}
		return true;
	}
}
