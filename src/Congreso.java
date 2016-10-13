import java.util.*;
public class Congreso {
	String nombre;
	Vector<Trabajo> trabajos;
	Vector<Evaluador> evaluadores;
	Vector<String> temasEspecificos;
	public Congreso(String nombre){
		this.nombre=nombre;
		trabajos=new Vector<Trabajo>();
		evaluadores=new Vector<Evaluador>();
		temasEspecificos=new Vector<String>();
	}
	public void agregarTrabajo(Trabajo trabajo){
		trabajos.add(trabajo);
	}
	public void agregarEvaluador(Evaluador evaluador){
		evaluadores.add(evaluador);
	}
	public void evaluadorParaCadaTrabajo(){
		for(int i=0;i<trabajos.size();i++){
			for(int j=0;j<evaluadores.size();j++){
				if(evaluadores.elementAt(j).soyParaEsteTrabajo(trabajos.elementAt(i))){
					System.out.println("El trabajo "+trabajos.elementAt(i).nombre+" tiene al evaluador "+evaluadores.elementAt(j).id);
				}
			}
		}
	}
	public Trabajo getTrabajo(String nombre){
		for(int i=0;i<trabajos.size();i++){
			if(trabajos.elementAt(i).nombre==nombre){
				return trabajos.elementAt(i);
			}
		}
		return null;
	}
	public void evaluadoresAsignadosATrabajo(String nombreTrabajo){
		Trabajo t=getTrabajo(nombreTrabajo);
		if(t!=null){
			for(int i=0;i<evaluadores.size();i++){
				if(t.esMiEvaluador(evaluadores.elementAt(i))){
					System.out.println("El trabajo "+t.nombre+" tiene asignado al evaluador "+evaluadores.elementAt(i).id);
					return;
				}
			}
			System.out.println("el trabajo "+t.nombre+" no tiene asignado ningun evaluador");
		}
		
	}
	public Evaluador getEvaluador(int id){
		for(int i=0;i<evaluadores.size();i++){
			if(evaluadores.elementAt(i).id==id){
				return evaluadores.elementAt(i);
			}
		}
		return null;
	}
	public void trabajosAsignadoAEvaluador(int id){
		Evaluador eva=getEvaluador(id);
		if(eva!=null){
			for(int i=0;i<trabajos.size();i++){
				if(eva.soyParaEsteTrabajo(trabajos.elementAt(i))){
					System.out.println("El Evaluador "+eva.id+" tiene asignado el trabajo "+trabajos.elementAt(i).nombre);
				}
			}
			if(contarTrabajosDeUnEvaluador(id)==0){
				System.out.println("el evaluador "+eva.id+" no tiene asignado ningun trabajo");
			}
		}
	}
	public int contarTrabajosDeUnEvaluador(int idEvaluador){
		Evaluador eva=getEvaluador(idEvaluador);
		int cont=0;
		if(eva!=null){
			for(int i=0;i<trabajos.size();i++){
				if(eva.soyParaEsteTrabajo(trabajos.elementAt(i))){
					cont++;
				}
			}
		}
		System.out.println("El evaluador "+eva.id+" tiene "+cont+" trabajos asignados");
		return cont;
	}
	public void evaluadorComunExperto(int id){
		Evaluador eva=getEvaluador(id);
		if(eva!=null){
			if(eva.experto(temasEspecificos)){
				System.out.println("el evaluador es EXPERTO");
			}else{System.out.println("el evaluador es COMUN");}
		}
	}
	public static void main(String[] args){
		Congreso cong=new Congreso("Programacion 2");
		cong.temasEspecificos.add("Programacion orientada a objetos");
		cong.temasEspecificos.add("java");
		cong.temasEspecificos.add("binding dinamico");
		cong.temasEspecificos.add("polimorfismo");
		//trabajo: 2 ways data binding
		Vector<String> palsClave = new Vector<String>();
		palsClave.add("binding dinamico");
		palsClave.add("java");
		cong.agregarTrabajo(new Trabajo("2 ways data binding",palsClave));
		//Trabajo: objetos super abstractos
		Vector<String> palsClave2 = new Vector<String>();
		palsClave2.add("Programacion orientada a objetos");
		palsClave2.add("polimorfismo");
		cong.agregarTrabajo(new Poster("objetos super abstractos",palsClave2));
		//evaluador 123
		Vector<String> conocimientos = new Vector<String>();
		conocimientos.add("Programacion orientada a objetos");
		conocimientos.add("java");
		conocimientos.add("polimorfismo");
		conocimientos.add("binding dinamico");
		conocimientos.add("c++");
		cong.agregarEvaluador(new Evaluador(123,conocimientos));
		//comprobar los trabajos que tiene el evaluador 123
		cong.trabajosAsignadoAEvaluador(123);
		//consultar si el evaluador 123 es comun o experto
		cong.evaluadorComunExperto(123);
	}
}
