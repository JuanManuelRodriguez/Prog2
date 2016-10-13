import java.util.Vector;

public class Pasturas extends Cereal{
	int haMinNecesarias=50;
	public Pasturas(String nombre, Vector<String> minerales) {
		super(nombre, minerales);
	}

	public boolean puedoPlantarme(Lote lote){
		if((super.puedoPlantarme(lote)) && (lote.getSuperficie()>=this.haMinNecesarias)){
			return true;
		}
		return false;
	}
}
