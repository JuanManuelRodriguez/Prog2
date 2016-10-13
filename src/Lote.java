import java.util.*;
public class Lote {
	String nombre;
	int superficieHa;
	Vector<String> mineralesSuelo;
	public Lote(String nombre,int superficie,Vector<String> minerales){
		this.nombre=nombre;
		this.superficieHa=superficie;
		mineralesSuelo=minerales;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getSuperficie(){
		return this.superficieHa;
	}
	public boolean esParaEsteLote(Cereal cereal){
		for(int i=0;i<cereal.mineralesNecesarios.size();i++){
			if(!mineralesSuelo.contains(cereal.mineralesNecesarios.elementAt(i))){
				return false;
			}
		}
		return true;
	}
	//dado por Luis------------inicio----------
	public boolean contiene(String mineral){
		return this.mineralesSuelo.contains(mineral);
	}

	public boolean equals(Object o1){
		Lote l=(Lote)o1;
		return this.nombre.equals(l.getNombre());
	}
	//-----------------fin-----------------
}