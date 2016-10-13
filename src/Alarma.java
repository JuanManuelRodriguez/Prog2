import java.util.*;

public abstract class Alarma {
	Vector<Sensor> sensores;
	
	public Alarma(){
		sensores=new Vector<Sensor>();
	}
	public abstract String comprobar();
	public void agregarSensor(String zona){
		sensores.add(new Sensor(zona));
	}
	public void setSensor(String zona){
		int i=0;
		while((i<sensores.size())&&(sensores.elementAt(i).zona!=zona)) {
			i++;
		}
		if(i==sensores.size()){
			System.out.println("zona no encontrada o no existe");
		}else{
			sensores.elementAt(i).activada=!sensores.elementAt(i).activada;
		}
	}
}
