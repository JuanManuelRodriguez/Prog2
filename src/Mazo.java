import java.util.*;
public class Mazo {
	String nombre;
	Vector cartas;
	public Mazo(String nombre){
		this.nombre=nombre;
		cartas=new Vector();
	}
	public String getNombre(){
		return this.nombre;
	}
	public void addCarta(Carta ca){
		if(cartas.size()==0){//si no hay cartas en el mazo
			cartas.add(ca);
		}else{
			Carta primera=(Carta)cartas.elementAt(0);//comparo siempre con la primera carta para que sean todas iguales
			if(primera.compatible(ca)){
				cartas.add(ca);
			}
		}
	}
}
