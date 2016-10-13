import java.util.*;

public class Nombres {
	
	public static void main(String[] args) {
		
		Collection<String> coleccion = new Vector<String>();
		Collection<String> otraColeccion = new Vector<String>();
		Collection<String> unaColeccionMas = new Vector<String>();
		
		coleccion.add("juan");
		coleccion.add("pedro");
		coleccion.add("matias");
		
		otraColeccion.add("pedro");
		otraColeccion.add("juan");
		
		unaColeccionMas.add("juan");
		unaColeccionMas.add("matias");
		
		if (coleccion.containsAll(otraColeccion)) {
			System.out.println("En la coleccion "+coleccion.toString()+" esta contenida la coleccion "+otraColeccion.toString());
		}
		
		if (coleccion.containsAll(unaColeccionMas)) {
			System.out.println("En la coleccion "+coleccion.toString()+" esta contenida la coleccion "+unaColeccionMas.toString());
		}
		
		if (otraColeccion.containsAll(unaColeccionMas)) {
			
			System.out.println("En la coleccion "+otraColeccion.toString()+" esta contenida la coleccion "+unaColeccionMas.toString());
		}else{
			System.out.println("En la coleccion "+otraColeccion.toString()+" no esta contenida la coleccion "+unaColeccionMas.toString());
		}

	}
	
}
