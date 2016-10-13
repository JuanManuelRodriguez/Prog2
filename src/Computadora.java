import java.util.*;
public class Computadora extends Comparable{
	int velocidad;
	public Computadora(int veloc){
		this.velocidad=veloc;
	}
	public boolean esMenor(Comparable c){//compara la pc actual con otra. 
		Computadora pc=(Computadora)c;
		if(this.velocidad < pc.velocidad){//si la pc es menor que la pasada por parametro, entonces devuelvo TRUE
			return true;
		}
		return false;
	}
	public void procesar(Proceso proc){
		//no se que hace
		System.out.println("El poceso con memoria "+proc.memoria+" fue procesado por la pc de vel "+this.velocidad);
	}
}
