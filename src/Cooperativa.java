import java.util.*;
public class Cooperativa {
	String nombre;
	Vector<String> mineralesPrimarios;
	Vector<Cereal> cereales;
	Vector<Lote> lotes;
	public Cooperativa(String nombre){
		this.nombre=nombre;
		mineralesPrimarios= new Vector<String>();
		cereales=new Vector<Cereal>();
		lotes=new Vector<Lote>();
	}
	public void agregarCereal(Cereal cereal){
		cereales.add(cereal);
	}
	public void agregarLote(Lote lote){
		lotes.add(lote);
	}
	public Lote getLote(String nombre){
		for(int i=0;i<this.lotes.size();i++){
			if(lotes.elementAt(i).getNombre().equals(nombre)){
				return lotes.elementAt(i);
			}
		}
		return null;
	}
	public Cereal getCereal(String nombre){
		for(int i=0;i<this.cereales.size();i++){
			if(cereales.elementAt(i).getNombre().equals(nombre)){
				return cereales.elementAt(i);
			}
		}
		return null;
	}
	public Vector getCereales(Lote l){
		Vector bolsita=new Vector();
		for(int i=0;i<cereales.size();i++){
			if(this.puedePlantarse(cereales.elementAt(i), l)){
				bolsita.add(cereales.elementAt(i));
			}
		}
		return bolsita;
	}
	public Vector getLotes(Cereal c){
		Vector bolsita=new Vector();
		for(int i=0;i<lotes.size();i++){
			if(this.puedePlantarse(c, lotes.elementAt(i))){
				bolsita.add(lotes.elementAt(i));
			}
		}
		return bolsita;
	}

	public boolean loteEspecial(Lote l){
		for(int i=0;i<this.mineralesPrimarios.size();i++){
			if(!l.contiene(this.mineralesPrimarios.elementAt(i))){
				return false;
			}
		}
		return true;
	}
	public Vector lotesEspeciales(){
		Vector bolsita=new Vector();
		for(int i=0;i < this.lotes.size();i++){
			if(this.loteEspecial(lotes.elementAt(i))){
				bolsita.add(lotes.elementAt(i));
			}
		}
		return bolsita;
	}
	// dado por Luis-----------inicio----------------
	public boolean puedePlantarse(Cereal c, Lote l){
		return c.puedoPlantarme(l);
	}
	public boolean existe(Lote l){
		if(this.lotes.contains(l)){
			return true;
		}
		return false;
	}
	//----------------fin-------------------
	public static void main(String[] args){
		Cooperativa coop=new Cooperativa("JuanCoop");
		coop.mineralesPrimarios.add("sodio");
		coop.mineralesPrimarios.add("nitrogeno");
		coop.mineralesPrimarios.add("fosforo");
		coop.mineralesPrimarios.add("potasio");
		//trigo
		Vector<String> mineralesTrigo = new Vector<String>();
		mineralesTrigo.add("potasio");
		mineralesTrigo.add("sodio");
		Cereal trigo=new Cereal("trigo",mineralesTrigo);
		coop.agregarCereal(trigo);
		//pastito
		Vector<String> mineralesPastito = new Vector<String>();
		mineralesPastito.add("fosforo");
		mineralesPastito.add("sodio");
		Pasturas pastito=new Pasturas("pastito",mineralesPastito);
		coop.agregarCereal(pastito);
		//lote 123
		Vector<String> mineralesLote = new Vector<String>();
		mineralesLote.add("potasio");
		mineralesLote.add("sodio");
		mineralesLote.add("fosforo");
		mineralesLote.add("nitrogeno");
		Lote lote=new Lote("123",51,mineralesLote);
		coop.agregarLote(lote);
		//comprobar si los cereales se pueden plantar en el lote 123
		coop.getCereales(coop.getLote("123"));
		//consultar si el lote 123 es comun o especial
		if(coop.loteEspecial(coop.getLote("123"))){
			System.out.println("el lote es especial");
		}else{
			System.out.println("el lote es comun");
		}
		if(coop.getCereal("pastito").puedoPlantarme(coop.getLote("123"))){
			System.out.println("el cereal puede plantarse en el lote");
		}else{
			System.out.println("el cereal NO puede plantarse en el lote");
		}
		
	}
}
