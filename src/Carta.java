import java.util.*;
public class Carta {
	Vector atributos;
	String nombre;
	public static final int GANE=1;
	public static final int EMPATE=0;
	public static final int PERDI=-1;
	public Carta(String nombre,Vector atributos){
		this.nombre=nombre;
		this.atributos=atributos;
	}
	public String getNombre(){
		return this.nombre;
	}
	public Atributo getAtributo(String nombre){
		for(int i=0;i<atributos.size();i++){
			Atributo at=(Atributo)atributos.elementAt(i);
			if(at.getNombre().equals(nombre)){
				return at;
			}
		}
		return null;
	}
	public int getCantidadAtributos(){
		return atributos.size();
	}
	public boolean compatible(Carta ca){
		if(atributos.size()==ca.getCantidadAtributos()){
			for(int i=0;i<atributos.size();i++){
				Atributo at=(Atributo)atributos.elementAt(i);
				if(ca.getAtributo(at.getNombre())==null){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
	public int compara(Carta ca,String atrib){
		Atributo mio=this.getAtributo(atrib);
		Atributo otro=ca.getAtributo(atrib);
		if(mio.getValor()>otro.getValor()){
			return GANE;
		}else if(mio.getValor()<otro.getValor()){
			return PERDI;
		}else{
			return EMPATE;
		}
	}
}
