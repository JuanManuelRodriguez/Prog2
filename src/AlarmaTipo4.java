
public class AlarmaTipo4 extends AlarmaSensorial{
	Telefono tel;
	public AlarmaTipo4(){
		tel=new Telefono();
	}
	public String comprobar(){
		String zonasActivadas="";
		for(int i=0;i<sensores.size();i++){
			if(sensores.elementAt(i).activada){
				zonasActivadas+=sensores.elementAt(i).getZona()+" "+this.timbre.hacerSonar()+" y "+this.luz.encender();
			}
		}
		return zonasActivadas;
	}
	public void infoDeEstado(){
		tel.informarEstado(comprobar());
		
	}
}
